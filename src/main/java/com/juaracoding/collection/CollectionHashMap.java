package com.juaracoding.collection;

import java.util.*;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Tue 20:47
@Last Modified Tue 20:47
Version 1.0
*/
public class CollectionHashMap {


    public static void main(String[] args) {
        User usr = new User();
        usr.setNama("Marcelino");
        usr.setEmail("marcel@gmail.com");
        usr.setPassword("Marcel@123");
        usr.setAlamat("Jakarta");
        usr.setNoHp("628578498609");
        usr.setUsername("marcel123");

//        HashMap<String,Object> hm = new HashMap<>();
        Map<String,Object> map = new HashMap<>();
        map.put("nama",usr.getNama());
        map.put("email",usr.getEmail());
        map.put("password",usr.getPassword());
        map.put("alamat",usr.getAlamat());
        map.put("noHp",usr.getNoHp());
        map.put("username",usr.getUsername());
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        };

        System.out.println("========================================");
        Map<String,Object> map1 = new LinkedHashMap<>();

        map1.put("nama",usr.getNama());
        map1.put("email",usr.getEmail());
        map1.put("password",usr.getPassword());
        map1.put("alamat",usr.getAlamat());
        map1.put("noHp",usr.getNoHp());
        map1.put("username",usr.getUsername());
        for (Map.Entry<String, Object> entry : map1.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        };

        System.out.println("======================================"); System.out.println("======================================");
        List<Map<String,Object>> list = new ArrayList<>();
        Map<String,Object> mapz = new HashMap<>();
        mapz.put("nama","Paul");
        mapz.put("email","paul@gmail.com");
        mapz.put("password","Paul@123");
        mapz.put("alamat","Bogor");
        mapz.put("noHp","628128498609");
        mapz.put("username","paul123");
        list.add(mapz);

        mapz = new HashMap<>();
        mapz.put("nama","Marcel");
        mapz.put("email","marcel@gmail.com");
        mapz.put("password","Marcel@123");
        mapz.put("alamat","Jakarta");
        mapz.put("noHp","628578498609");
        mapz.put("username","marcel123");
        list.add(mapz);

        for (int i = 0; i < list.size(); i++) {
            Map<String,Object> map2 = list.get(i);
            for (Map.Entry<String, Object> entry : map2.entrySet()) {
                System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
            };
            System.out.println("======================================");
        }
        System.out.println("======================================");
        System.out.println("======================================");
        for (int i = 0; i < list.size(); i++) {
            Map<String,Object> map2 = list.get(i);

            System.out.println(map2.get("nama"));
            System.out.println(map2.get("alamat"));
            System.out.println(map2.get("password"));
            System.out.println(map2.get("email"));
            System.out.println(map2.get("username"));
            System.out.println("======================================");
        }
    }
}
