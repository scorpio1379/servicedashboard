package ru.iteco.ip.servicedashboard.dataobjectmodel.impls.abstracts;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

import java.util.UUID;

/**
 * Created by Scorpio on 30.03.2017.
 */
@NodeEntity
public abstract class BaseServiceObjectImpl<T> {
    @GraphId
    protected Long id;
    protected String internalId;
    protected String displayName;
    protected String name;

    public BaseServiceObjectImpl() {
        this.internalId = UUID.randomUUID().toString();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInternalId() {
        return internalId;
    }


    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this.equals(o)) return true;
        if (o == null || this.internalId.isEmpty() || getClass() != o.getClass()) return false;

        BaseServiceObjectImpl entity = (BaseServiceObjectImpl) o ;

        return this.internalId == entity.internalId;
    }

    @Override
    public int hashCode() {
        return (this.internalId.isEmpty()) ? -1 : this.internalId.hashCode();
    }
}
