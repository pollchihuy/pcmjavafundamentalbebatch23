package com.juaracoding.wrapperclass;

import com.juaracoding.ClassPassing;

import java.util.ArrayList;
import java.util.List;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Mon 21:11
@Last Modified Mon 21:11
Version 1.0
*/
public class ContohWrapperClass {

    public static void main(String[] args) {
        List<ClassPassing> listInt = new ArrayList<ClassPassing>();
        listInt.add(new ClassPassing());
        listInt.add(new ClassPassing());
        System.out.println(listInt);

        System.out.println(Integer.toBinaryString(15));
        System.out.println(Integer.parseInt("1000")+20);
        System.out.println("1000"+20);
        System.out.println(Double.parseDouble("100"));
        System.out.println(String.valueOf(10.0));
        System.out.println(String.valueOf(10));
        System.out.println(String.valueOf(10L));
        System.out.println("true");
        System.out.println(true);

        Character c = 'A';
        int intC = c;
        //jika angka ok else not ok?
        if(c>=48 && c<=57){
            System.out.println("OK");
        }else {
            System.out.println("NOT OK");
        }
    }
}
