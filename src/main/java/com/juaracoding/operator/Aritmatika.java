package com.juaracoding.operator;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Tue 19:49
@Last Modified Tue 19:49
Version 1.0
*/
public class Aritmatika {

    public static void main(String[] args) {
        int num1=45;
        int num2=20;
        int sum=num1%num2;
        System.out.println(sum);

//        45-20->25
//                25-20->5

        int x = 2;
        x += 3;// x = x + 3
        System.out.println("Nilai X adalah : "+x);

        int total = 10 * ++x;
        System.out.println(total);

        double f = ((((5+3)%2)-8)+4)/9.0;
        System.out.println(f);

        System.out.println(5<=5);

        int intCharA=65;
        System.out.println("Biner dari x adalah "+Integer.toBinaryString(intCharA));

    }
}
