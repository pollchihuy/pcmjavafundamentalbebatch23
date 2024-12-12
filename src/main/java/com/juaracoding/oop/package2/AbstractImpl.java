package com.juaracoding.oop.package2;

import java.util.List;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Thu 20:09
@Last Modified Thu 20:09
Version 1.0
*/
public class AbstractImpl {

    public static void main(String[] args) {
        ClassAbstract classAbstract = new ClassAbstract() {
            @Override
            public void fungsiAbstract() {
                fungsiBiasa("Hue");
            }
        };
        classAbstract.fungsiAbstract();

        System.out.println("Jalan !!");
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("print "+i);
                }
            }
        });
        t.start();
        System.out.println("Stop Thread Awal ");//123456
    }
}
