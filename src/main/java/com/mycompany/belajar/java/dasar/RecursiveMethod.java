/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajar.java.dasar;

/**
 *
 * @author Administrator
 */
public class RecursiveMethod {
    public static void main(String[] args) {
        
        System.out.println(factorial(5));
        System.out.println(1 * 2 * 3 * 4 * 5);
        
        System.out.println(factorial(5));
        
        loop(10);
    }
    
    static int factorial(int value){
        var result = 1;
        for (int counter = 1; counter <= value; counter++) {
            result *= counter;
        }
        return result;
    }
    
    static int factorialRecursive(int value){
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }
    
    static void loop(int value){
        if (value == 0) {
            System.out.println("Selesai");
        }else {
            System.out.println("Loop-" + value);
            loop(value - 1);
        }
    }
}
