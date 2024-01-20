package com.mycompany.belajar.java.dasar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class Array {
    public static void main(String[] args) {
        String[] stringArray;
                stringArray = new String[3];
                
                stringArray[0] = "Alvenio";
                stringArray[1] = "Farhan";
                stringArray[2] = "Prayogo";
                
                System.out.println(stringArray[0]);
                System.out.println(stringArray[1]);
                System.out.println(stringArray[2]);
                
                stringArray[0] = "Budi";
                System.out.println(stringArray[0]);

                
                String[] stringArray2 = new String[3];
                
                String[] namaNama = {
                    "Alvenio", "Farhan", "Prayogo"
                };
                namaNama[0]=null;
                
                int[] arrayInt = new int[]{
                    1,2,3,4,5,6,7,8,9,10
                };
                
                long[] arrayLong = {
                    10L, 20L, 30L
                };
                
                arrayLong[0] = 0;
                
                System.out.println(arrayLong.length);
                
                String[][] members = {
                    {"Alvenio", "Farhan"},
                    {"Joko", "Tingkir"},
                    {"Budi", "Utomo"}
                };
                
                System.out.println(members[0][1]);
                System.out.println(members[1][0]);
    }
}
