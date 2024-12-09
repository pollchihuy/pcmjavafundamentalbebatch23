package com.juaracoding.variousprograming;

import com.juaracoding.ClassPassing;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Mon 19:03
@Last Modified Mon 19:03
Version 1.0
*/
public class MathMethod {

    public static void main(String[] args) {
//        System.out.println(Math.sqrt(4));
//        System.out.println(Math.pow(2,3));
//        System.out.println(Math.sin(90));
//        System.out.println(Math.round(4.49999999999999));
//        System.out.println(Math.ceil(4.000000000000000009));
//        System.out.println(Math.floor(4.91231564878745413999));
//        System.out.println("4.4999999999999911111");
//        double param1 = filteringDesimalDigit15("4.4999999999999911111");
//        double param2 = filteringDesimalDigit15("7.1213145534534121656");
//        System.out.println(param1);
//        System.out.println(param2);
//        System.out.println((3+4)*(2/(3%6)));
//        System.out.println(Math.abs(-2));
//        String strNamaFirst = "Dono";
//        String strNamaSecond = "Doyok";
//        System.out.println(strNamaFirst.compareTo(strNamaSecond));
        ClassPassing [] cp = new ClassPassing[2];
        int intPassing [] = new int[12];
        intPassing[0] = 0;
        intPassing[1] = 1;
        intPassing[2] = 2;
        intPassing[3] = 3;
        intPassing[4] = 4;
        intPassing[5] = 5;
        for (int i = 0; i < intPassing.length; i++) {
            System.out.println(intPassing[i]);
        }
        double [] douArr = new double[2];
        System.out.println(douArr[0]);
        System.out.println(douArr[1]);
        int intCara[] = {1,2,3,4};
//        int intCara[] = new int[4];
        int intDuaDimensi [][] = new int[2][3];


//        caret
    }

    public static double filteringDesimalDigit15(String strText){
        String [] strArr = strText.split("\\.");
        if(strArr[1].length()>15){
            strArr[1] = strArr[1].substring(0,15);
        }
        String strResult = strArr[0]+"."+strArr[1];
        double douResult = Double.parseDouble(strResult);
        return douResult;
    }
}
