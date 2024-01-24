/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum8;

/**
 *
 * @author rizka
 */
//Main Class

public class MainClass {
        public static void main (String[]args) {
            
            //hitung luas, keliling, dan simetri dari suatu lingkaran A dg r=19 satuan
            Lingkaran A = new Lingkaran();
            A.jejari = 19;
            A.tampilHasil();
            
             //hitung luas, keliling, dan simetri dari suatu persegi panjang B dg panjang=10 & lebar=5 satuan
            PersegiPanjang B = new PersegiPanjang();
            B.panjang = 10;
            B.lebar = 5;
            B.tampilHasil();
            
            //hitung luas dari segitiga C dg alas=12 & tinggi=8 satuan
            Segitiga C = new Segitiga();
            C.alas = 12;
            C.tinggi = 8;
            C.tampilHasil();
            
            //hitung luas, keliling, dan simetri dari suatu Belah Ketupat  D dg sisi = 15 satuan
            BelahKetupat D = new BelahKetupat();
            D.sisi = 15;
            D.tampilHasil();
        }
    }

