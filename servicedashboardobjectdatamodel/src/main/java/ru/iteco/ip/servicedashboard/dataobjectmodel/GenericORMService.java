package ru.iteco.ip.servicedashboard.dataobjectmodel;

import org.neo4j.ogm.session.Session;
import ru.iteco.ip.servicedashboard.dataobjectmodel.impls.abstracts.BaseServiceObjectImpl;

/**
 * Created by Scorpio on 30.03.2017.
 */
public  abstract class  GenericORMService<T extends BaseServiceObjectImpl> implements ORMService<T>{

    private static final int DEPTH_LIST = 0;
    private static final int DEPTH_ENTITY = 1;
    protected Session session = Neo4JSessionFactory.getInstance().getNeo4jSession();

    @Override
    public Iterable<T> findAll() {
        return session.loadAll(getEntityType(), DEPTH_LIST);
    }

    @Override
    public T find(Long id) {
        Class<T> et = getEntityType();
        T obj = session.load(et, id, DEPTH_ENTITY);
        return obj;
    }

    @Override
    public void delete(Long id) {
        session.delete(session.load(getEntityType(), id));
    }

    @Override
    public T createOrUpdate(T entity) {
        session.save(entity, DEPTH_ENTITY);
        return find(entity.getId());
    }

    abstract Class<T> getEntityType();
}
