/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operadoreslogicos;

/**
 *
 * @author Dell
 */
public class OperadoresLogicos {

    public static void main(String[] args) {
        int x,y,z;
        x = 4;
        y = 7;
        z = 12;
        Boolean r;
        //r = (x<y && y<z)?true:false;
       // r = (x<y || y==z)?true:false;
        r = (x<y ^ y<z)?true:false;
        System.out.println(r);
    }
}
