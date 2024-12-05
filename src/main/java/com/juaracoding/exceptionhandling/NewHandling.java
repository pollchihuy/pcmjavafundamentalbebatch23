package com.juaracoding.exceptionhandling;

import com.juaracoding.ClassPassing;

import java.sql.SQLException;
import java.util.Scanner;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Wed 20:30
@Last Modified Wed 20:30
Version 1.0
*/
public class NewHandling {

    public static void main(String[] args) {
//        System.out.println(1/0);
        try{
            System.out.println("Masuk dulu kesini");
        //        ClassPassing classPassing = null;
        //        System.out.println(classPassing.getH());
//                System.out.println(1/0);
        //        Thread.sleep(1000);
                Scanner sc = new Scanner(System.in);
                System.out.print("Masukkan Angka : ");
                int input = sc.nextInt();
        //        System.out.println(input);
        }catch(Exception e){
            System.out.println("Masuk Kesini Illegal Argument Error nya adalah : "+e.getMessage());
        }finally {
            System.out.println("INi akan di eksekusi");
            //tutup koneksi nya disini
        }
//        System.out.println(Integer.parseInt("100"));
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        C:\\download\\data\\123.jpeg

//        int intArr [] = {1,2,3,4};
//        System.out.println(intArr[5]);
        Scanner scn = new Scanner(System.in);
        int intX = scn.nextInt();
        if(intX>10){
            throw new IllegalArgumentException("Harus Lebih dari 10");
        }else {
            System.out.println("DONE !!");
        }
        System.out.println("Hue");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {

        }
    }

    public static void callData()throws SQLException {
        System.out.println("Masuk sini !!");
    }
}