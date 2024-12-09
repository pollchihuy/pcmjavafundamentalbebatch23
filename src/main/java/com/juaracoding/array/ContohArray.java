package com.juaracoding.array;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Mon 20:33
@Last Modified Mon 20:33
Version 1.0
*/
public class ContohArray {

    public static void main(String[] args) {
        int intArr [] = {5,3,4};
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
        System.out.println("SESUDAH DIRUBAH !!");
        intArr[2] = 3;
        intArr[1] = 4;
        //5,4,3
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }

    }
}
