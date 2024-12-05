package com.juaracoding.method;

import java.util.Scanner;

public class LuasBangunan {

    public void pilihan(){
        System.out.print("Pilih  Program Yang Diinginkan :\n");
        System.out.print("1. Hitung Persegi\n");
        System.out.print("2. Hitung Persegi Panjang\n");
        System.out.print("3. Hitung Segitiga\n");
    }

    public void hitungLuasSegitiga(Scanner sc){
        System.out.print("Masukkan Nilai Alas : ");
        double alas = sc.nextDouble();
        System.out.print("Masukkan Nilai Tinggi : ");
        double tinggi = sc.nextDouble();
        double luas = (alas*tinggi)/2;
        System.out.println("Luas Segitiga "+luas);
    }

    public void hitungLuasPersegi(Scanner sc){
        System.out.print("Masukkan Nilai sisi : ");
        double sisi = sc.nextDouble();
        double luasPersegi = sisi*sisi;
        System.out.println("Luas Persegi "+luasPersegi);
    }

    public void hitungLuasPersegiPanjang(Scanner sc){
        System.out.print("Masukkan Nilai Panjang : ");
        double panjang = sc.nextDouble();
        System.out.print("Masukkan Nilai Lebar : ");
        double lebar = sc.nextDouble();
        double luasPersegiPanjang = panjang*lebar;
        System.out.println("Luas Persegi "+luasPersegiPanjang);
    }
}