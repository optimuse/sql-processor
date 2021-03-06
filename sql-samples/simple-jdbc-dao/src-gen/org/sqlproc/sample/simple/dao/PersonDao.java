package org.sqlproc.sample.simple.dao;

import java.util.List;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlRowProcessor;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.sample.simple.dao.BaseDao;
import org.sqlproc.sample.simple.model.Person;

@SuppressWarnings("all")
public interface PersonDao extends BaseDao {
  public Person insert(final SqlSession sqlSession, final Person person, SqlControl sqlControl);
  
  public Person insert(final Person person, SqlControl sqlControl);
  
  public Person insert(final SqlSession sqlSession, final Person person);
  
  public Person insert(final Person person);
  
  public Person get(final SqlSession sqlSession, final Person person, SqlControl sqlControl);
  
  public Person get(final Person person, SqlControl sqlControl);
  
  public Person get(final SqlSession sqlSession, final Person person);
  
  public Person get(final Person person);
  
  public int update(final SqlSession sqlSession, final Person person, SqlControl sqlControl);
  
  public int update(final Person person, SqlControl sqlControl);
  
  public int update(final SqlSession sqlSession, final Person person);
  
  public int update(final Person person);
  
  public int delete(final SqlSession sqlSession, final Person person, SqlControl sqlControl);
  
  public int delete(final Person person, SqlControl sqlControl);
  
  public int delete(final SqlSession sqlSession, final Person person);
  
  public int delete(final Person person);
  
  public List<Person> list(final SqlSession sqlSession, final Person person, SqlControl sqlControl);
  
  public List<Person> list(final Person person, SqlControl sqlControl);
  
  public List<Person> list(final SqlSession sqlSession, final Person person);
  
  public List<Person> list(final Person person);
  
  public int query(final SqlSession sqlSession, final Person person, SqlControl sqlControl, final SqlRowProcessor<Person> sqlRowProcessor);
  
  public int query(final Person person, SqlControl sqlControl, final SqlRowProcessor<Person> sqlRowProcessor);
  
  public int query(final SqlSession sqlSession, final Person person, final SqlRowProcessor<Person> sqlRowProcessor);
  
  public int query(final Person person, final SqlRowProcessor<Person> sqlRowProcessor);
  
  public int count(final SqlSession sqlSession, final Person person, SqlControl sqlControl);
  
  public int count(final Person person, SqlControl sqlControl);
  
  public int count(final SqlSession sqlSession, final Person person);
  
  public int count(final Person person);
  
  public SqlControl getMoreResultClasses(final Person person, SqlControl sqlControl);
}
