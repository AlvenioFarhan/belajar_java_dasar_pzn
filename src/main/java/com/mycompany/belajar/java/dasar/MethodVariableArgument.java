/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajar.java.dasar;

/**
 *
 * @author Administrator
 */
public class MethodVariableArgument {
    public static void main(String[] args) {
        
        int[] values = {80, 80, 80, 80};
        sayCongrats("Alvenio", values);

        sayCongrats("Budi", 50,50,75,80);
    }
    
    static void sayCongrats(String name, int... values){
        
        int total = 0;
        for (var value : values){
            total += value;
        }
        int finalValue = total / values.length;
        
        if (finalValue >= 75) {
            System.out.println("Selamat "+ name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }
}
