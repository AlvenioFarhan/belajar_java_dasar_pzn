/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajar.java.dasar;

/**
 *
 * @author Administrator
 */
public class MethodReturnValue {
    public static void main(String[] args) {
        
        var a = 100;
        var b = 200;
        var c = sum(a, b);
        
        var result = sum(300,200);
        
        System.out.println(c);
        System.out.println(result);
        System.out.println(sum(100,100));
        
        System.out.println(hitung(100, "+", 200));
        System.out.println(hitung(500, "-", 300));
        System.out.println(hitung(500, "salah", 300));
    }
    
    static int sum(int value1, int value2){
        var total = value1 + value2;
        return total;
    }
    
    static int hitung(int value1, String operasi, int value2){
        switch (operasi) {
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            default:
                return 0;
                
        }
    }
}
