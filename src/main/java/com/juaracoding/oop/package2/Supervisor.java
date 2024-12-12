package com.juaracoding.oop.package2;

import com.juaracoding.oop.package1.Karyawan;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Thu 19:18
@Last Modified Thu 19:18
Version 1.0
*/
public class Supervisor extends Karyawan {

    private Double tunjangan;
    private Double tambahanLain;

    public Double getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(Double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public Double getTambahanLain() {
        return tambahanLain;
    }

    public void setTambahanLain(Double tambahanLain) {
        this.tambahanLain = tambahanLain;
    }
}
