package com.juaracoding.array;

import java.util.Scanner;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Mon 20:42
@Last Modified Mon 20:42
Version 1.0
*/
public class LinearSearch {

    public static void main(String[] args) {
        int intArr []= {2,41,66,23,88};

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Angka yg ingin dicari : ");
        int intInput = sc.nextInt();
        //flag
        boolean isValid = false;

        for (int i = 0; i < intArr.length; i++) {
            if(intInput==intArr[i]){
                isValid = true;
                System.out.println("Data ditemukan pada index ke "+i);
                break;
            }
        }

        if(!isValid){
            System.out.println("Data tidak ditemukan");
        }
    }
}
