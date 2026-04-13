package com.juaracoding.oop.dao;

import com.juaracoding.oop.model.Menu;

public interface MenuDao {

    public void findAll();
    public void save(Menu menu);
    public void delete(Long id);
    public void update(Long id,Menu menu);

}
