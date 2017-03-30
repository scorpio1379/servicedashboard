package ru.iteco.ip.servicedashboard.dataobjectmodel;


import org.neo4j.ogm.drivers.embedded.driver.EmbeddedDriver;
import org.neo4j.ogm.service.Components;
import ru.iteco.ip.servicedashboard.dataobjectmodel.impls.cis.ServiceCiImpl;
import ru.iteco.ip.servicedashboard.graphdb.GraphDataBaseBean;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

/**
 * Created by Scorpio on 30.03.2017.
 */
@Singleton(name = "tstBeanEJB")
@LocalBean
@Startup
public class tstBeanBean {
    @Inject
    private GraphDataBaseBean gdb;
    public tstBeanBean() {
    }

    @PostConstruct
    void init(){
        boolean a = gdb.isAvailable(100);
        System.out.println("isAvailable=" + a);
        Components.setDriver(new EmbeddedDriver(gdb.getGdbs()));
        CiORMService ci = new CiORMServiceImpl();
        ci.createOrUpdate(new ServiceCiImpl());
        System.out.println();
    }
}
