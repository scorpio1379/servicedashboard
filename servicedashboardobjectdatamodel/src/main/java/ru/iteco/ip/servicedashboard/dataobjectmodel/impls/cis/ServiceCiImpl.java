package ru.iteco.ip.servicedashboard.dataobjectmodel.impls.cis;

import org.apache.commons.collections4.SetUtils;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import ru.iteco.ip.servicedashboard.dataobjectmodel.impls.abstracts.BaseServiceObjectImpl;
import ru.iteco.ip.servicedashboard.dataobjectmodel.interfaces.indicators.Hi;
import ru.iteco.ip.servicedashboard.dataobjectmodel.interfaces.indicators.Kpi;

import java.util.Set;

/**
 * Created by Scorpio on 30.03.2017.
 */
@NodeEntity
public class ServiceCiImpl<T> extends BaseServiceObjectImpl<ServiceCiImpl<T>>  {
    @Relationship(type= "ATTACHED_KPI", direction=Relationship.INCOMING)
    protected Set<Kpi> attachedKpis = SetUtils.emptySet();
    @Relationship(type= "ATTACHED_HI", direction=Relationship.INCOMING)
    protected Set<Hi> attachedHis = SetUtils.emptySet();

    public ServiceCiImpl() {
        super();
    }
}
