/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajar.java.dasar;

/**
 *
 * @author Administrator
 */
public class MethodParameter {
    public static void main(String[] args) {
        
        sayHello("Alvenio", "Farhan");
        sayHello("Joko", "Tingkir");
    }
    
    static void sayHello(String firstName, String lastName){
        System.out.println("Hello "+ firstName+ " "+ lastName);
    }
}
