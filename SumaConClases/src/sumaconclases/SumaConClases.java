/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumaconclases;

import java.util.Scanner;

/**
 *
 * @author Chamba Joven
 */
public class SumaConClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros: ");
        double numero1 = entrada.nextDouble();
        double numero2 = entrada.nextDouble();
        double resultado;
        resultado = SumaDeNumeros.Suma(numero1, numero2);
        
        System.out.println("El resultado es: "+ resultado);
        
    }
    
}
