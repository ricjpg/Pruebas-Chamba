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
public class FibonacciSeriesBelow4M {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n1, n2, fb, cont;
        n1=1;
        n2=2;
        fb=0;
        while(fb < 4000000)
        {
            fb = n1+n2;
            n2 = fb;
            n1 = n2;
            System.out.println("fibonucci series is: ");
            System.out.println(fb);
            fb += fb;
            //System.out.println("El contador es igual a ");
            //System.out.println(fb);
        }
        System.out.println("El contador es igual a ");
        System.out.println(fb);
    }
    
}
