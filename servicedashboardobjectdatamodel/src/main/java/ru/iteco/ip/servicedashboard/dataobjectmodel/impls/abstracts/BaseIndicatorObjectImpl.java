package ru.iteco.ip.servicedashboard.dataobjectmodel.impls.abstracts;

import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Created by Scorpio on 30.03.2017.
 */
@NodeEntity
public abstract class BaseIndicatorObjectImpl<T> extends BaseServiceObjectImpl<BaseIndicatorObjectImpl<T>> {
    protected String status;
    protected String value;
    protected boolean isVisible;
    protected boolean isDisable;

    public BaseIndicatorObjectImpl() {
        super();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }

    public boolean isDisable() {
        return isDisable;
    }

    public void setDisable(boolean disable) {
        isDisable = disable;
    }
}
