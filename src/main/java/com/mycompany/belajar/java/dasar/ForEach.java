/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajar.java.dasar;

/**
 *
 * @author Administrator
 */
public class ForEach {
    public static void main(String[] args) {
        
        String[] names = {
            "Alvenio", "Farhan", "Prayogo",
            "Programmer", "Zaman", "Now"
        };
        
//        for (var i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }

        //FOR EACH
        for (var name : names) {
            System.out.println(name);
        }
    }
}
