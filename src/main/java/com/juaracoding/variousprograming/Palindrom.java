package com.juaracoding.variousprograming;

import java.util.Scanner;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Fri 21:00
@Last Modified Fri 21:00
Version 1.0
*/
public class Palindrom {

    public static void main(String[] args) {
        //Kodok
        //kodoK
//        System.out.println("Kodok".equalsIgnoreCase("kodoK"));
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Kata : ");
        String strInput = sc.nextLine();
        char [] chArr = strInput.toCharArray();
        int intInput = chArr.length;
        String strOutput = "";
        for (int i = (intInput-1);
             i >= 0;
             i--) {//infinite loop
            strOutput = strOutput + chArr[i];
        }
        System.out.println("Output is: " + strOutput);
        System.out.println((strOutput.equalsIgnoreCase(strInput))?"Kata Tersebut Adalah Palindrom":"Kata Tersebut Bukan Palindrom");
    }
}