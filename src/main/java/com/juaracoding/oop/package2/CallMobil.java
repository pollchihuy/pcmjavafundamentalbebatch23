package com.juaracoding.oop.package2;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Wed 19:53
@Last Modified Wed 19:53
Version 1.0
*/
public class CallMobil {

    public static void main(String[] args) {
//        Mobil mobil = new Mobil();//091820jr
//        mobil.setWarna("biru");
//        mobil.setMerk("Honda");
//        mobil.setModel("BRIO");
//        mobil.setJumlahKursi(2);
//        mobil.setTahunProduksi("2022");
//
//        mobil = new Mobil();//4f8923
//        mobil.setWarna("merah");
//        mobil.setMerk("Honda");
//        mobil.setModel("BRIO");
//        mobil.setJumlahKursi(2);
//        mobil.setTahunProduksi("2021");

//        Mobil mobil = new Mobil();
        ReadOnly readOnly = new ReadOnly(
                "root",
                "paul",
                "localhost:8083"
        );
        System.out.println(readOnly.getPassword());
        System.out.println(readOnly.getUsername());
        System.out.println(readOnly.getConnectionString());
    }
}
