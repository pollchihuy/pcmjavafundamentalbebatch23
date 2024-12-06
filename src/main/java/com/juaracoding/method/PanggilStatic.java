package com.juaracoding.method;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Fri 20:10
@Last Modified Fri 20:10
Version 1.0
*/
public class PanggilStatic {


    //Konfigurasi
    //alamat db / url db / connection string
    // username
    // password
    // driver
    public static void main(String[] args) {
        ContohStatic c1 = new ContohStatic();
        System.out.println("Object c1 : "+c1);
        c1.getCount();
        ContohStatic c2 = new ContohStatic();
        System.out.println("Object c2 : "+c2);
        c2.getCount();
        ContohStatic c3 = new ContohStatic();
        System.out.println("Object c3 : "+c3);
        c3.getCount();
        getData();
    }

    public static void getData(){
//        queue
    }
}
