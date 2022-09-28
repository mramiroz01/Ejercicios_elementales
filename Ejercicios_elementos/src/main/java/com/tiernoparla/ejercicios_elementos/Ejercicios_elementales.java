/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiernoparla.ejercicios_elementos;

/**
 *
 * @author vespertino
 */
public class Ejercicios_elementales {
    
    static  void pares(int i)
    {
        while (i <= 10)
        {
            if (i % 2 == 0)
                System.out.println(i);
            i++;
        }
    }
    
    static void division(int D, int d)
    {
        int c;
        int r;
        
        c = D / d;
        r = D % d;
    }
    public static void main(String[] args) {
        
    }
}
