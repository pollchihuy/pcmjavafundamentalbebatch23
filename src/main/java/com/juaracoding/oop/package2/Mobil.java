package com.juaracoding.oop.package2;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Wed 19:52
@Last Modified Wed 19:52
Version 1.0
*/
public class Mobil {

    private String warna;
    private String tahunProduksi;
    private int jumlahKursi;
    private String merk;
    private String model;

    public Mobil() {
        System.out.println("INI DI EKSEKUSI SAAT INSTANTIASI OBJECT");
//        username = paul;
//        password = root;
//        connectionString = jdbc:mssql//localhost:8080/db/schemaName=dbo
    }

    public Mobil(String x){
        System.out.println("INI DI EKSEKUSI SAAT INSTANTIASI OBJECT DENGAN PARAMETER STRING");
    }

    public String getTahunProduksi() {
        return tahunProduksi;
    }

    public void setTahunProduksi(String tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getWarna() {
        return warna;
    }
}