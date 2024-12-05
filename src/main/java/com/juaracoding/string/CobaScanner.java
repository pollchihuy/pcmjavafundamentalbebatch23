package com.juaracoding.string;

import java.util.Scanner;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Wed 19:58
@Last Modified Wed 19:58
Version 1.0
*/
public class CobaScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String strLanjut = "0";
        while(strLanjut.equals("0")){
            System.out.print("Masukkan Panjang : ");
            int intPanjang = sc.nextInt();
            System.out.print("Masukkan Lebar : ");
            int intLebar = sc.nextInt();
            int intLuasPersegiPanjang = intPanjang * intLebar;
            System.out.println("Luas Persegi Panjang Adalah : "+intLuasPersegiPanjang);
            System.out.print("Apakah Anda Ingin Melanjutkan (Tekan 0 jika Ya): ");
            strLanjut = sc.next();
        }

        double douX = sc.nextDouble();
        float floX = sc.nextFloat();
        short shoX = sc.nextShort();
        byte byteX = sc.nextByte();
        long loX = sc.nextLong();
    }
}
