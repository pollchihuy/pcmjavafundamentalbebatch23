package com.juaracoding.oop.package1;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Wed 19:14
@Last Modified Wed 19:14
Version 1.0
*/
public class Object1 {

    private String strX;
    private int intX;
    int intY;
    protected String strY;
    public int intZ = 10;

    protected final String getStrX() {
        return strX;
    }

    public void setStrX(String strX) {
        this.strX = strX;
    }

    public int getIntX() {
        return intX;
    }

    public void setIntX(int intX) {
        this.intX = intX;
    }

    public int getIntY() {
        return intY;
    }

    public void setIntY(int intY) {
        this.intY = intY;
    }

    public String getStrY() {
        return strY;
    }

    public void setStrY(String strY) {
        this.strY = strY;
    }

    public int getIntZ() {
        return intZ;
    }

    public void setIntZ(int intZ) {
        this.intZ = intZ;
    }
}