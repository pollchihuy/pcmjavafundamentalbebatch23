package com.juaracoding.variousprograming;

import java.util.Random;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Fri 21:28
@Last Modified Fri 21:28
Version 1.0
*/
public class RandomBuatDataEmail {

    public static void main(String[] args) {
        Random rand = new Random();
//        String strVokal = "aiueo";
//        String strKonsonan = "bcdfghjklmnpqrstvwxyz";
        String strAlfabet = "abcdefghijklmnopqrstuvwxyz";
        int intAlfabet = strAlfabet.length();
        String strProvider [] = {"gmail","yahoo","rocketmail","ymail"};
        String strDomain [] = {"com","co.id","edu","sch","gov"};
//        karakter + angka + @ + provider + . + domain
//        8-16 digit
        for (int i = 0; i < 1000; i++) {
            int intRandomChar = rand.nextInt(8,17);
            String email = "";
            for (int j = 0; j < intRandomChar; j++) {
                email = email + strAlfabet.charAt(rand.nextInt(intAlfabet));
            }
            email = email+rand.nextInt(1000)+"@"+strProvider[rand.nextInt(strProvider.length)]+"."+strDomain[rand.nextInt(strDomain.length)];
            System.out.println(email);
        }
    }
}
