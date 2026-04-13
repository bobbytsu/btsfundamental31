package com.juaracoding.oop.core;

import com.juaracoding.oop.model.Data;

public interface IService<T> {

    public void save(T t);//001-010
    public void update(Long id,T t);//011-020
    public void delete(Long id);//021-030
    public void findAll();//031-040
}