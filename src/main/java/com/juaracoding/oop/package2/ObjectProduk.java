package com.juaracoding.oop.package2;

import com.juaracoding.oop.package1.ObjectLain;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Thu 19:11
@Last Modified Thu 19:11
Version 1.0
*/
public class ObjectProduk extends ObjectLain {

    private String nama;
    private String jenis;

    public ObjectProduk() {
        super();
    }

    @Override
    public Double getCalculate() {
        super.ambil=2.0;
        return super.getCalculate();

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}
