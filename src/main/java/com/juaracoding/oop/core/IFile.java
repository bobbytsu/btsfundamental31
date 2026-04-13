package com.juaracoding.oop.core;

public interface IFile<T> {

    public void upload(T t);
    public void downloadPdf(T t);
    public void downloadExcel(T t);
}