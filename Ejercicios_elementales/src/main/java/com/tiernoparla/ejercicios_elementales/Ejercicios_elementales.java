
package com.tiernoparla.ejercicios_elementales;

public class Ejercicios_elementales {
    static void pares(int i)
    {
        while(i <= 10)
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
        System.out.println("El dividendo es igual a " + D);
        System.out.println("El divisor es igual a " + d);
        System.out.println("El cociente es igual a " + c);
        System.out.println("El resto es igual a " + r);
    }
    
    static void fibonacci (int limiter)
    {
        int first = 0;
        int after = 1;
        
        while(first < limiter)
        {
            first = first + after;
            System.out.println(first);
            after = first + after;
            System.out.println(after);
        }
    }
    
    public static void main(String[] args) {
        fibonacci(100);
    }
}
