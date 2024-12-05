package com.juaracoding.exceptionhandling;

import java.util.Scanner;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Wed 20:17
@Last Modified Wed 20:17
Version 1.0
*/
public class HandlingException {

    public static void main(String[] args) {
//        System.out.println(1/0);

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Angka 10 s.d 20 : ");
        int intInput = sc.nextInt();
//        System.out.println(intInput);
        if(!(intInput>=10 && intInput<=20)){
            System.out.println("Program Berhenti");
            System.exit(0);
        }

        while (true){
            System.out.println("Program Tetap Berjalan");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
