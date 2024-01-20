/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajar.java.dasar;

/**
 *
 * @author Administrator
 */
public class MethodOverloading {
    public static void main(String[] args) {
        
        sayHello();
        sayHello("Alvenio");
        sayHello("Alvenio", "Farhan");
    }
    
    static void sayHello(){
        System.out.println("Hello");
    }
    static void sayHello(String name){
        System.out.println("Hello " + name);
    }
    static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
