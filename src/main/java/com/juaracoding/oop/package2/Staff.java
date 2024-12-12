package com.juaracoding.oop.package2;

import com.juaracoding.oop.package1.Karyawan;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Thu 19:17
@Last Modified Thu 19:17
Version 1.0
*/
public class Staff extends Karyawan {
    private String atasanLangsung;

    public String getAtasanLangsung() {
        return atasanLangsung;
    }

    public void setAtasanLangsung(String atasanLangsung) {
        this.atasanLangsung = atasanLangsung;
    }
}
