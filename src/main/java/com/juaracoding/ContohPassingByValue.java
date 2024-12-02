package com.juaracoding;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Mon 21:25
@Last Modified Mon 21:25
Version 1.0
*/
public class ContohPassingByValue {

    public static void main(String[] args) {
        int z = 15;
        ubahVariable(z);
        System.out.println(z);
    }

    public static void ubahVariable(int m){
        m = 14;
    }
}
