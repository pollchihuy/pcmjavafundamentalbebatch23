package com.juaracoding.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.SequencedCollection;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Tue 19:58
@Last Modified Tue 19:58
Version 1.0
*/
public class DynamicBinding {

    public static void main(String[] args) {
//        Dynamic Binding
        Interface1Impl impl = new Interface1Impl();
        impl.functionOne();
        impl.functionTwo();
        impl.functionThree();
        impl.functionFour();
        impl.functionFive();

        Interface1 impl2 = new Interface1Impl();
        impl2.functionOne();
        impl2.functionTwo();
        impl2.functionThree();

        ArrayList<String> list = new ArrayList<>();
        list.trimToSize();
        List<String> list1 = new ArrayList<>();
        list1.size();
        list1.toArray();
    }
}
