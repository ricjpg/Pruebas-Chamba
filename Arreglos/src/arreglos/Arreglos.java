/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Random;

/**
 *
 * @author Chamba Joven
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arreglo1 = new int[5];
        Random rnd = new Random();
        System.out.println("Primer For");
        for(int i=0; i<5;i++)
        {
            arreglo1[i] = rnd.nextInt(20);
            System.out.println(arreglo1[i]);
        }
        System.out.println("\n\nSegundo FOR");
        for(int x: arreglo1){
            arreglo1[0] = rnd.nextInt(20)+2;
            System.out.println(x);
    }
        
    }
    
}
