package ru.iteco.ip.servicedashboard.graphdb;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import java.io.File;

/**
 * Created by Scorpio on 30.03.2017.
 */
@Singleton(name = "GraphDataBaseEJB")
@LocalBean
public class GraphDataBaseBean {
    private GraphDatabaseService gdbs;
    public GraphDataBaseBean() {

    }
    @PostConstruct
    private void initGraphDataBase(){
        this.gdbs = new GraphDatabaseFactory().newEmbeddedDatabase( new File("C:\\Users\\Scorpio\\Documents\\Neo4j\\default.graphdb"));
        System.out.println("Grapg DB Inited");
    }
    @PreDestroy
    private void disposeGraphDataBase(){
        this.gdbs.shutdown();
        System.out.println("Grapg DB disposed");
    }

    public boolean isAvailable(long l) {
        return gdbs.isAvailable(l);
    }
    public GraphDatabaseService getGdbs(){
        return this.gdbs;
    }
}
