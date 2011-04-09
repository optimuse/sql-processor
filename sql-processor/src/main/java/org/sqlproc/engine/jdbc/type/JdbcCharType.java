package org.sqlproc.engine.jdbc.type;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.sqlproc.engine.type.SqlCharType;

/**
 * The JDBC META type CHARACTER.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class JdbcCharType extends SqlCharType implements JdbcSqlType {

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlType() {
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProviderSqlNullType() {
        return Types.CHAR;
    }

    @Override
    public Object get(ResultSet rs, String columnLabel) throws SQLException {
        String str = rs.getString(columnLabel);
        if (str == null) {
            return null;
        } else {
            return new Character(str.charAt(0));
        }
    }

    @Override
    public void set(PreparedStatement st, int index, Object value) throws SQLException {
        st.setString(index, (value).toString());
    }
}
