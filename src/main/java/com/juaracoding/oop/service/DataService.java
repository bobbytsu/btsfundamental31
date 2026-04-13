package com.juaracoding.oop.service;

import com.juaracoding.oop.core.IService;
import com.juaracoding.oop.dao.DataDao;
import com.juaracoding.oop.model.Data;

/**
 * project code : OPS
 * modul code : 01
 */
public class DataService implements IService<Data> {

    @Override//001-010
    public void save(Data data) {

        if(data==null){
            System.out.println("Data tidak boleh null "+"OPS01001");
            return;
        }
        if(!data.getData1().equals("ok")){
            System.out.println("Data1 tidak boleh ok "+"OPS01002");
            return;
        }
        //proses

    }

    @Override//011-020
    public void update(Long id, Data data) {

        if(id==null){
            System.out.println("Data tidak boleh null "+"OPS01011");
            return;
        }
        if(data==null){
            System.out.println("Data tidak boleh null "+"OPS01012");
            return;
        }
        if(!data.getData1().equals("ok")){
            System.out.println("Data1 tidak boleh ok "+"OPS01013");
            return;
        }
    }

    @Override
    public void delete(Long id) {
        if(id==null){
            System.out.println("Data tidak boleh null "+"OPS01021");
            return;
        }
    }

    @Override
    public void findAll() {
        if(false){
            System.out.println("Data tidak Ditemukan "+"OPS01031");
            return;
        }
    }
}
