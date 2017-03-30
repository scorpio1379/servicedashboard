package ru.iteco.ip.servicedashboard.dataobjectmodel.impls.indicators;

import org.neo4j.ogm.annotation.NodeEntity;
import ru.iteco.ip.servicedashboard.dataobjectmodel.impls.abstracts.BaseIndicatorObjectImpl;
import ru.iteco.ip.servicedashboard.dataobjectmodel.interfaces.indicators.Kpi;


/**
 * Created by Scorpio on 30.03.2017.
 */
@NodeEntity
public class KpiObjectImpl<T> extends BaseIndicatorObjectImpl<KpiObjectImpl<T>> implements Kpi<T> {
    public KpiObjectImpl() {
        super();
    }
}
