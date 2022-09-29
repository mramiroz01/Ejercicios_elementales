
package com.tiernoparla.ejercicios_elementales;

import java.util.Scanner;

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
    
    static void div()
    {
        Scanner sc = new Scanner(System.in);
        int N;
        int D;
        System.out.print("Dame un dividendo: ");
        N = sc.nextInt();
        System.out.print("Dame un divisor: ");
        D = sc.nextInt();

        int r;
        int q;

        q = 0;
        r = N;

        while (r >= D)
        {
            r = r - D;
            q++;
        }
        System.out.println(N == D * q + r);
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
     
    static void capicua(int num)
    {
        //int numinv;
        int rest = num;

        while (rest >= 0)
        {
            rest = num / 10;
        }
        System.out.println(rest);
    }
    public static void main(String[] args) {
        div();
    }
}
