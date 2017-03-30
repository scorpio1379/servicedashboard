package ru.iteco.ip.servicedashboard.dataobjectmodel;

/**
 * Created by Scorpio on 30.03.2017.
 */
public interface ORMService<T>  {

    Iterable<T> findAll();

    T find(Long id);

    void delete(Long id);

    T createOrUpdate(T object);

}
