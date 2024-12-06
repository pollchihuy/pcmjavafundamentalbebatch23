package com.juaracoding.method;


public class ContohStatic {

    private static int count;

    public ContohStatic() {
        count++;
    }

    public void getCount(){
        System.out.println("Nilai Count : "+count);
    }
}