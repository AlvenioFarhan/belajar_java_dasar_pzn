/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajar.java.dasar;

/**
 *
 * @author Administrator
 */
public class OperasiBoolean {
    public static void main(String[] args) {
        
        var absen = 70;
        var nilaiAkhir = 80;
        
        var lulusAbsen = absen >= 75;
        var lulusNilai = nilaiAkhir >= 75;
        
        var lulus = lulusAbsen && lulusNilai;
        System.out.println(lulus);
    }
}
