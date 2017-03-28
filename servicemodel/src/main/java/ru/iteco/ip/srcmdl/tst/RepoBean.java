package ru.iteco.ip.srcmdl.tst;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;

import javax.annotation.PostConstruct;
import javax.ejb.Local;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import java.io.File;

/**
 * Created by Scorpio on 28.03.2017.
 */
@Singleton(name = "RepoEJB")
@Startup
@Local
public class RepoBean {
    protected String str;
    private GraphDatabaseService gdbs;
    public RepoBean() {
        this.gdbs = new GraphDatabaseFactory().newEmbeddedDatabase(new File("C:\\Users\\Scorpio\\Documents\\Neo4j\\default.graphdb"));
    }
    @PostConstruct
    private void initRepo(){
        this.str = "fdgdds";
        System.out.println("started");
    }
}
