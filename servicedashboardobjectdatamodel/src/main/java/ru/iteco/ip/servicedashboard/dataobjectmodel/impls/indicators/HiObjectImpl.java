package ru.iteco.ip.servicedashboard.dataobjectmodel.impls.indicators;

import org.neo4j.ogm.annotation.NodeEntity;
import ru.iteco.ip.servicedashboard.dataobjectmodel.impls.abstracts.BaseIndicatorObjectImpl;
import ru.iteco.ip.servicedashboard.dataobjectmodel.interfaces.indicators.Hi;

/**
 * Created by Scorpio on 30.03.2017.
 */
@NodeEntity
public class HiObjectImpl<T> extends BaseIndicatorObjectImpl<HiObjectImpl<T>> implements Hi<T>{
    protected String dataPumpSourceObjectId;

    public HiObjectImpl() {
        super();
    }
}
