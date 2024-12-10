package com.juaracoding.collection;

import com.juaracoding.ClassPassing;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Mon 21:36
@Last Modified Mon 21:36
Version 1.0
*/
public class CollectionPendahuluan {


    public static void main(String[] args) {
        ClassPassing classPassingArr [] = new ClassPassing[2];
        ClassPassing classPassing = new ClassPassing();
        classPassing.setH(2);
        classPassingArr[0]=classPassing;
        classPassing = new ClassPassing();
        classPassing.setH(3);
        classPassingArr[1]=classPassing;
//        System.out.println(classPassingArr);
        for (int i = 0; i < classPassingArr.length; i++) {
            System.out.println(classPassingArr[i].getH());
        }

        User modelDataArr [] = new User[2];
        User modelData = new User();
        modelData.setAlamat("Bogor");
        modelData.setNama("Paul");
        modelData.setEmail("Paul@gmail.com");
        classPassingArr[0]=classPassing;
        classPassing = new ClassPassing();
        classPassing.setH(3);
        classPassingArr[1]=classPassing;
//        System.out.println(classPassingArr);
        for (int i = 0; i < classPassingArr.length; i++) {
            System.out.println(classPassingArr[i].getH());
        }
    }
}
