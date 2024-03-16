/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajar.java.dasar;

/**
 *
 * @author Administrator
 */
public class Continue {
    public static void main(String[] args) {
        
        for (var counter = 1; counter <= 100; counter++) {
            if (counter % 2 == 1) {
                continue;
            }
            System.out.println("Perulangan Ganjil = " + counter);
        }
    }
}
