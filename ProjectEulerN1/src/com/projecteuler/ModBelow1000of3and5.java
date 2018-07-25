/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projecteuler;

/**
 *
 * @author Chamba Joven
 */
public class ModBelow1000of3and5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double accu3;
        double accu5;
        double result;
        int cont = 999;
        result = 0.0d;
        accu3=0.0d;
        accu5=0.0d;
        while(cont <1000 && cont>0)
        {
            if(cont%3==0)
            {
                accu3 +=cont;
            }
            else if(cont%5==0)
            {
                accu5 +=cont;
            }
            else
            {
                System.out.println(cont);
            }
       cont--;
        }
        result = accu3+accu5;
        System.out.println("El contador de 3 below 1000 = ");
        System.out.println(accu3);
        System.out.println("El contador de 5 below 1000 = ");
        System.out.println(accu5);
        System.out.println("la suma de ambos es = ");
        System.out.println(result);
        
    }
    
}
