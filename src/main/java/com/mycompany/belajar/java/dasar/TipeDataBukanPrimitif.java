package com.mycompany.belajar.java.dasar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer iniInteger = 100;
        Long iniLong = 1000L;
        Byte iniByte;
        iniByte = null;
        
        System.out.println(iniByte);
        
        iniByte = 100;
        System.out.println(iniByte);
        
        int iniInt = 100;
//        Integer iniInteger2 = iniInt;
//        System.out.println(iniInteger2);
              
        Integer iniObject = iniInt;
        short iniShort = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();
        float iniFloat = iniObject.floatValue();
        System.out.println(iniShort);
    }
}
