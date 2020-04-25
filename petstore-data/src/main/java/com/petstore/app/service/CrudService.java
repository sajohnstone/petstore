package com.petstore.app.service;

import java.util.Set;

public interface CrudService<T,ID> {

    T FindById(ID id);

    T Save(T object);

    Set<T> findAll();

    void Delete(T object);

    void DeleteById(ID id);
}