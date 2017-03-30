package ru.iteco.ip.servicedashboard.dataobjectmodel;

/**
 * Created by Scorpio on 30.03.2017.
 */

import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;

public class Neo4JSessionFactory {
    private final static SessionFactory sessionFactory = new SessionFactory("ru.iteco.ip.servicedashboard.dataobjectmodel");
    private static Neo4JSessionFactory factory = new Neo4JSessionFactory();

    public static Neo4JSessionFactory getInstance() {
        return factory;
    }

    // prevent external instantiation
    private Neo4JSessionFactory() {
    }

    public Session getNeo4jSession() {
        return sessionFactory.openSession();
    }
}
