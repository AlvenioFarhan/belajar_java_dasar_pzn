/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajar.java.dasar;

/**
 *
 * @author Administrator
 */
public class Scope {
    public static void main(String[] args) {
        
        sayHello("Alvenio");
    }
    
    static void sayHello(String name){
        String hello = "Hello " + name;
        
        if (!name.isBlank()) {
            String hi = "Hi " + name;
            System.out.println(hi);
        }
        
        System.out.println(hello);
//        System.out.println(hi);
    }
}
