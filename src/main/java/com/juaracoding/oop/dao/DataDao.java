package com.juaracoding.oop.dao;

import com.juaracoding.oop.model.Data;
import com.juaracoding.oop.model.Menu;

public interface DataDao {

    public void save(Data data);
    public void update(Long id,Data data);
    public void delete(Long id);
    public void findAll();
}
