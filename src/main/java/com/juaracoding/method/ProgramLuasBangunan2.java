package com.juaracoding.method;

import java.util.Scanner;

public class ProgramLuasBangunan2 {

    public static void main(String[] args) {
        LuasBangunan luasBangunan = new LuasBangunan();
        Scanner sc = new Scanner(System.in);
        luasBangunan.pilihan();
        int pilih = sc.nextInt();
        switch (pilih) {
            case 1:luasBangunan.hitungLuasPersegi(sc);break;
            case 2:luasBangunan.hitungLuasPersegiPanjang(sc);break;
            case 3:luasBangunan.hitungLuasPersegi(sc);break;
            default:System.out.println("Pilihan tidak ditemukan !!");
        }
    }
}
