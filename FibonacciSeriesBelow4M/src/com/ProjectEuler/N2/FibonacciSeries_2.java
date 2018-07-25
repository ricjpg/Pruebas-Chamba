/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProjectEuler.N2;

/**
 *
 * @author Chamba Joven
 */
public class FibonacciSeries_2 {
    
    
    public static void main (String [] args)
    {
        int n1=1, n2=2, serie=0, cont=0, fbs, suma;
        fbs=3;
        suma=0;
        //fbs=n1+n2;
        while(serie <4000000)
        {
            
            if(serie%2==0)
            {
                System.out.println("Se sumara...");
                suma+=serie;
                System.out.println("LA SUMA VA EN: ");
                System.out.println(suma);
            }
            else
            {
                System.out.println("No es par...");
            }
            
            serie = n1+n2;
            System.out.println("Series = ");
            System.out.println(serie);
            
            n1=n2;
            n2=serie;
            fbs+=serie;
            //System.out.println("$           la suma de Series = ");
            //System.out.println(fbs);
            //cont++;
            
            
        }
        System.out.println("La suma de la serie de Fibonacci es: ");
        System.out.println(fbs);
        
        
        System.out.println("LA SUMA TOTAL ES DE: ");
        System.out.println(suma+2);
        //2178309
    }
}
