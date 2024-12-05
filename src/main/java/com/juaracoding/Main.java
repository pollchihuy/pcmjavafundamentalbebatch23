package com.juaracoding;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int intX = 2;
        short shortX = 2;
        long longX = 2L;
        float floatX = 2.0f;
        System.out.println(Integer.MAX_VALUE);
        if(longX == 3){
            System.out.println("Masuk ke IF Nilai LongX : "+longX);
        }else {
            System.out.println("Masuk ke Else Nilai LongX : "+longX);
        }
        System.out.println(Long.MAX_VALUE);
        /**
         * Dokumen
         * TOR (Term Of References)
         * BRD (Business Requirement Document)
         * FSD (Functional Specification Document)
         * TD (Technical Documentation)
         * DD (Deployment Document) -> BAST
         * UM (User Manual)
         */

//        for (int i = 0; i < 5; i++) {
//            if(i==2){
//                break;
//            }
//            // proses selanjutnya tidak di eksekusi
//        }
        int x = 20;
        if(x %2 ==0){
            if(x/100 !=0){System.out.println("Bilangan Genap Lebih Dari 100");}
        }else{
            if(x/10 !=0){System.out.println("Bilangan Genap Lebih Dari 10");}
        }

        int intJ = 3/5;
        System.out.println(intJ);//floor 2,9 -> 2.0
        //ceil 2,1 -> 3.0
        //round 2.6 -> 3.0
        //round 2.5 -> 2.0
        String strX = new StringBuilder().append("OK").append(2).append(40.3).append(12).append("Hue").append("OK").append(2).append(40.3).append(12).append("Hue").append("OK").append(2).append(40.3).append(12).append("Hue").append("OK").append(2).append(40.3).append(12).append("Hue").append("OK").append(2).append(40.3).append(12).append("Hue").append("OK").append(2).append(40.3).append(12).append("Hue").append("OK").append(2).append(40.3).append(12).append("Hue").append("OK").append(2).append(40.3).append(12).append("Hue").append("OK").append(2).append(40.3).append(12).append("Hue").append("OK").append(2).append(40.3).append(12).append("Hue").append("OK").append(2).append(40.3).append(12).append("Hue").append("OK").append(2).append(40.3).append(12).append("Hue").append("OK").append(2).append(40.3).append(12).append("Hue").append("OK").append(2).append(40.3).append(12).append("Hue").append("OK").append(2).append(40.3).append(12).append("Hue").append("OK").append(2).append(40.3).append(12).append("Hue").append("OK").append(2).append(40.3).append(12).append("Hue").append("OK").append(2).append(40.3).append(12).append("Hue").append("OK").append(2).append(40.3).append(12).append("Hue").append("OK").append(2).append(40.3).append(12).append("Hue").append("OK").append(2).append(40.3).append(12).append("Hue").append("OK").append(2).append(40.3).append(12).append("Hue").append("OK").append(2).append(40.3).append(12).append("Hue").append("OK").append(2).append(40.3).append(12).append("Hue").append("OK").append(2).append(40.3).append(12).append("Hue").append("OK").append(2).append(40.3).append(12).append("Hue").toString();
    int intL = 5;
//    String strL = "2";
//        if(intL==1){
//            System.out.println();
//        }else if(intL == 2){
//            System.out.println();
//        }else if(intL == 3){
//            System.out.println();
//        }else if(intL == 4){
//            System.out.println();
//        }else if(intL == 5){
//            System.out.println();
//        }else {
//            System.out.println();
//        }
//
//        switch (strL){
//            case "1":
//                System.out.println();break;
//            case "2":
//                System.out.println();break;
//            case "3":
//                System.out.println();break;
//            case "4":
//                System.out.println();break;
//            case "5":
//                System.out.println();break;
//            default:
//                System.out.println();break;
//        }

//        ClassPassing classPassing = null;
//        if(intL==6){
//            classPassing = new ClassPassing();
//            classPassing.setH(2);
//        }
//        System.out.println(classPassing.getH());
        int intH =0;
//        if(classPassing == null){
//            intH = 0;
//        }else {
//            classPassing = new ClassPassing();
//            classPassing.setH(2);
//        }
//        intH = (classPassing==null)?0:classPassing.getH();
//        System.out.println(intH);

        int [] intU = {1,2,3,4,5};
//        System.out.println("Index ke 0 "+intU[0]);
//        System.out.println("Index ke 1 "+intU[1]);
//        System.out.println("Index ke 2 "+intU[2]);
//        System.out.println("Index ke 3 "+intU[3]);
//        System.out.println("Index ke 4 "+intU[4]);


//        for (int i = 0;
//             i < intU.length;
//             i++) {
//            System.out.println("Index ke "+i+" : "+intU[i]);
//        }

//        String strF = "Paul";//4
//        int intLength = strF.length();
//        for (int i = 0;
//             i < intLength;// 1
//             i++) {
//            System.out.println(strF.charAt(i));
//        }

        int intArr [][] = {{1,2,3},{4,5,6,7},{8,9,10,11,12}};
        int intRow = intArr.length;//ekstrak informasi banyaknya baris
//        int intCol = intArr[0].length;//ekstrak informasi banyaknya kolom
        int intCol = 0;//ekstrak informasi banyaknya kolom
        for (int i = 0; i < intRow; i++) {
            intCol = intArr[i].length;
            for (int j = 0; j < intCol; j++) {
                System.out.print(intArr[i][j]+"\t");
            }
            System.out.println();
        }

//        int intWhile = 1;
//        while(intWhile==0){
//
//        }

//        int intData [] = {3,1,12,88,65,45,64};
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Masukkan nilai yang ingin dicari : ");
//        int intValue = scanner.nextInt();
//        for (int i = 0; i < intData.length; i++) {
//            if(intValue == intData[i]){
//                System.out.println("Data ditemukan");
//                break;
//            }
//        }

        int intData2 [] = {3,1,12,88,65,45,64,77,64,23};
        for (int i = 0; i < intData2.length; i++) {
            if(intData2[i] % 2 == 0){
                continue;
            }
            System.out.print(intData2[i]+"\t");
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 2; k++) {
                    if(k==1){
                        break;
                    }
                }
                System.out.println("Disini !!");
            }
        }
    }
}