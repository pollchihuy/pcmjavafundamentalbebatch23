package com.juaracoding.collection;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Tue 19:10
@Last Modified Tue 19:10
Version 1.0
*/
public class CollectionImpl {

    public static void main(String[] args) {
        //1 info , yaitu = banyak  nya data ..... rs.size()
        User [] userArr = new User [2];
        User usr = new User ();//5f184fc6
        System.out.println("Reference usr 1 "+usr);
        usr.setNama("Paul");
        usr.setEmail("paul@gmail.com");
        usr.setPassword("Paul@123");
        usr.setAlamat("Bogor");
        usr.setNoHp("628128498609");
        usr.setUsername("paul123");
        userArr[0] = usr;
        usr = new User ();//4j184fc6
        System.out.println("Reference usr 1 "+usr);
        usr.setNama("Marcelino");
        usr.setEmail("marcel@gmail.com");
        usr.setPassword("Marcel@123");
        usr.setAlamat("Jakarta");
        usr.setNoHp("628578498609");
        usr.setUsername("marcel123");
        userArr[1] = usr;

        for (int i = 0; i < userArr.length; i++) {
            System.out.println("Nama : "+userArr[i].getNama());
            System.out.println("Alamat : "+userArr[i].getAlamat());
            System.out.println("NoHp : "+userArr[i].getNoHp());
            System.out.println("Username : "+userArr[i].getUsername());
            System.out.println("Password : "+userArr[i].getPassword());
            System.out.println("Email : "+userArr[i].getEmail());
            System.out.println("=======================");
        }

        int intArr [] = new int[2];
        intArr[0]=10;
        intArr[1]=20;
        for (int i = 0; i < intArr.length; i++) {
            System.out.println("Value : "+intArr[i]);
        }


    }
}
