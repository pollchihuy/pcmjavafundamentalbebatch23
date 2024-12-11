package com.juaracoding.oop.package2;

import java.util.ArrayList;
import java.util.List;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Wed 20:48
@Last Modified Wed 20:48
Version 1.0
*/
public class CallUser {


    public static void main(String[] args) {
        User user = new User();
//        user.nama="Paul";
//        System.out.println(user.nama);
        user.setNama("Paul");
        System.out.println(user.getNama());
//        user.setNama("Paul");
//        System.out.println(user.getNama());
//        System.out.println("");
//        System.out.println(1L);
//        System.out.println(1);
//        System.out.println(true);

//        Extend2 extend2 = new Extend2();
//        extend2.ok1();
    }

    public void data(String str, int intX){

    }

    public void data(int intX,String str){

    }

    public void data(int intX,String str,double douX){

    }

    public void data(int intX,String str,String b){
        List l = new ArrayList();
        l.add("");
        l.size();

        Extend1 extend = new Extend2();
        extend.ok1();
        extend.ok2();



    }
}
