/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valormaximo;

import java.util.Scanner;

/**
 *
 * @author Chamba Joven
 */
public class ValorMaximo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero1;
        double numero2;
        double numero3;
        double valMax;
        System.out.println("Ingrese 3 numeros: ");
        numero1 = entrada.nextDouble();
        numero2 = entrada.nextDouble();
        numero3 = entrada.nextDouble();
 
        valMax = Maximo.Maximo(numero1, numero2, numero3);
 
        System.out.println("El valor maximo es: "+ valMax);
    }
    
}
