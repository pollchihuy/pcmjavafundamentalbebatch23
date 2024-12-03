package com.juaracoding.string;

import com.juaracoding.ClassPassing;

public class BikinClass {
    public static void main(String[] args) {
//        System.out.println(10+3);
        String strX = "1a6s54ed6a874w6351e65a4we6q54eoi1j23oiuj1";
        char [] chArr = strX.toCharArray();
//        Built-In Function
        System.out.println(strX.length());
        for (int i = 0; i < chArr.length ; i++) {
            System.out.println(chArr[i]);
        }
        System.out.println(strX.substring(0,8));
        System.out.println(strX+"garam");

        ClassPassing classPassing = new ClassPassing();
        System.out.println(strX);
        System.out.println(classPassing);

        String str1 = "OK";
        String str2 ="OK";
//        String str2 = new String("OK");

        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
//        System.out.println(str1 == str2);
    }
}