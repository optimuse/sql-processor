package org.sqlproc.sample.catalog.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlOrder;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.sample.catalog.form.ItemForm;
import org.sqlproc.sample.catalog.model.Item;
import org.sqlproc.sample.catalog.to.ItemTO;

public class ItemDao {

    protected final Logger logger = LoggerFactory.getLogger(getClass());
    protected SqlEngineFactory sqlFactory;

    public Item findById(SqlSession session, Long id) {
        Item item = sqlFactory.getCheckedCrudEngine("GET_ITEM").get(session, Item.class, new Item(id));
        logger.info("findById: " + item.toDebugString());
        return item;
    }

    public Item create(SqlSession session, Item item) {
        logger.info("create: " + item.toDebugString());
        sqlFactory.getCheckedCrudEngine("INSERT_ITEM").insert(session, item);
        logger.info("create: " + item.toDebugString());
        return item;
    }

    public Item update(SqlSession session, Item item) {
        logger.info("update: " + item.toDebugString());
        sqlFactory.getCheckedCrudEngine("UPDATE_ITEM").update(session, item);
        logger.info("update: " + item.toDebugString());
        return item;
    }

    public void delete(SqlSession session, Long id) {
        logger.info("delete: " + id);
        sqlFactory.getCheckedCrudEngine("DELETE_ITEM").delete(session, new Item(id));
    }

    public List<ItemTO> find(SqlSession session, ItemForm criteria) {
        logger.info("find: " + criteria);
        return sqlFactory.getCheckedQueryEngine("ITEMS").query(session, ItemTO.class, criteria, null,
                SqlOrder.getOrder(criteria.getOrder()), 0, criteria.getCount(), criteria.getFirst());
    }

    public int findCount(SqlSession session, ItemForm criteria) {
        logger.info("findCount: " + criteria);
        return sqlFactory.getCheckedQueryEngine("ITEMS").queryCount(session, criteria);
    }

    @Required
    public void setSqlFactory(SqlEngineFactory sqlFactory) {
        this.sqlFactory = sqlFactory;
    }
}
