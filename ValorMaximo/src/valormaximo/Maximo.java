/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valormaximo;

/**
 *
 * @author Chamba Joven
 */
public class Maximo {
    public static double Maximo (double x, double y, double z){
        double valorMaximo = x;
        if (y > valorMaximo){
            valorMaximo = y;
        }
        if (z > valorMaximo){
            valorMaximo = z;
        }
        
        return valorMaximo;
    }
}
