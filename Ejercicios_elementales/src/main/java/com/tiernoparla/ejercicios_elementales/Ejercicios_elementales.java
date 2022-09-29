
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
    
    static void div(int N, int D)
    {
        int r;
        int q;

        q = 0;
        r = N;

        while (r >= D)
        {
            r = r - D;
            q++;
        }
        System.out.println("El cociente es: " + q);
        System.out.println("El resto es: " + r);

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
        div(33, 5);
    }
}
