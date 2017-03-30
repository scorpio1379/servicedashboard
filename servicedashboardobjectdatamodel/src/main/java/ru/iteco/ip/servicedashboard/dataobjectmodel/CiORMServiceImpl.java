package ru.iteco.ip.servicedashboard.dataobjectmodel;

import ru.iteco.ip.servicedashboard.dataobjectmodel.impls.cis.ServiceCiImpl;

/**
 * Created by Scorpio on 30.03.2017.
 */
public class CiORMServiceImpl extends GenericORMService<ServiceCiImpl> implements CiORMService {

    @Override
    Class<ServiceCiImpl> getEntityType() {
        Class<ServiceCiImpl> r = ServiceCiImpl.class;
        return r;
    }
}
