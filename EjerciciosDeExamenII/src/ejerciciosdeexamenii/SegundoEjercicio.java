/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdeexamenii;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class SegundoEjercicio {

    public static ArrayList lista() {
        int suma = 0;
        int sumaParaCeros = 0;
        int resta = 0;
        int acumulador = 0;
        boolean cero = false;
        Scanner leer = new Scanner(System.in);
        ArrayList<Integer> lista1 = new ArrayList<>();
        String seguir = "s";
        while (seguir.equalsIgnoreCase("s")) {
            System.out.print("Ingrese un elemento: ");
            lista1.add(leer.nextInt());
            System.out.print("Desea Ingresar otro elemento? S/N: ");
            seguir = leer.next();
        }
        for (Integer r : lista1) {
            //System.out.println(r);
            sumaParaCeros = +r;
            if (((lista1.indexOf(r)) % 2) == 0) {
                acumulador += r;
            }else{
                acumulador -=r;
            }
            
        }
        if ((sumaParaCeros == 0)) {
            cero = true;
        }
        if (cero) {
            System.out.println("CERO");
        } else {
            System.out.println("Acumulador = "+ acumulador);
        }

        return lista1;
    }

    public static void main(String[] args) {
        lista();
    }
}