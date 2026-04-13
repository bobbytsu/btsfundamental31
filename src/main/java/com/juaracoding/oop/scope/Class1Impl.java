package com.juaracoding.oop.scope;

public class Class1Impl extends Class1 {

    Long fieldz;
    public Class1Impl(Long fieldz) {
        super();
        super.fieldz= fieldz;
    }

    public void callPrint(){
        super.print1();
        super.fieldz=100L;
    }

    // private -> no modifier -> protected -> public
    @Override
    public void print1() {
        System.out.println("Hello World dari Class1Impl");
    }
}
