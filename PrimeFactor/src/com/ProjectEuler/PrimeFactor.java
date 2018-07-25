/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProjectEuler;

/**
 *
 * @author Chamba Joven
 */
public class PrimeFactor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double meta = 600851475143d;
        double longf = 0;
        double prime = 2;
        
        while (meta%prime<meta)
        {
            longf = meta%prime;
            System.out.println("Fator = ");
            System.out.println(longf);
            prime ++;
        }
    }
    
}
