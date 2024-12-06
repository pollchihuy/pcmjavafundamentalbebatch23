package com.juaracoding.variousprograming;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Fri 20:54
@Last Modified Fri 20:54
Version 1.0
*/
public class VokalKonsonan {

    public static void main(String[] args) {
        String huruf = "z";
        if(
                huruf.equals("a") ||
                huruf.equals("i") ||
                huruf.equals("u") ||
                huruf.equals("e") ||
                huruf.equals("o")

        ){
            System.out.println("Huruf Vokal");
        }else {
            System.out.println("Huruf Konsonan");
        }
    }
}
