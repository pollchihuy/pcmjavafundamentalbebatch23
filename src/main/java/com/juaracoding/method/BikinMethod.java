package com.juaracoding.method;

import java.util.Scanner;

public class BikinMethod {

    static LuasBangunan luasBangunan = new LuasBangunan();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int intZ = 12;
        getData(intZ);
        getData(2,"OK");
    }


    public static void getData(String str){
        LuasBangunan l = new LuasBangunan();
        System.out.println("Parameter str Terpanggil");
    }

    public static void getData(int intX){
        luasBangunan.hitungLuasSegitiga(sc);
//        Modifier modifier =new Modifier();
//        modifier.mod = 2;
        System.out.println("Parameter int Terpanggil");
    }

    public static void getData(String str, int intX){
        System.out.println("Parameter int Terpanggil");
    }
    public static void getData(int intX,String str){
        System.out.println("Parameter int Terpanggil");
    }

}
