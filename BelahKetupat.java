/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum8;

/**
 *
 * @author rizka
 */
// Kelas BelahKetupatImpl.java

public class BelahKetupat extends BangunDatar implements Keliling,
        Simetri{
    //atribut
    public int sisi;
    
    
    //methods
    
    @Override
    public double hitungLuas(){
        return (this.sisi*this.sisi)/2;
    }
     @Override
    public double hitungKeliling(){
        return 4*(this.sisi);
    }
     @Override
    public double hitungSimPutar(){
        return 2.0;
    }
     @Override
    public double hitungSimLipat(){
        return 2.0;
    }
     @Override
    public void tampilHasil(){
        System.out.println("Belah Ketupat");
        System.out.println("------");
        System.out.println("Luasnya: "+this.hitungLuas());
        System.out.println("Kelilingnya: "+this.hitungKeliling());
        System.out.println("Sim.Lipat: "+this.hitungSimLipat());
        System.out.println("Sim.Putar: "+this.hitungSimPutar());
    }
}
