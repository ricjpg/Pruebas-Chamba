/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helloworld;

import java.util.Scanner;

public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        
        int x;
        x = read.nextInt();
        
        System.out.println(x);
        
    }
    
}
