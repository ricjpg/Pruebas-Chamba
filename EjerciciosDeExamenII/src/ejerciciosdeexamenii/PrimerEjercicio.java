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
public class PrimerEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList<Integer> arregloNotas = new ArrayList<>();
        ArrayList arregloClases = new ArrayList();
        ArrayList<Integer> notasMaximas = new ArrayList<>();
        ArrayList clasesMaximas = new ArrayList();
        String seguir = "s";
        String nombreClase;
        int notaClase;
        int indice = 0;
        int max = 0;
        double promedio = 0;
        
        while(seguir.equalsIgnoreCase("s")){
            seguir = "n";
            System.out.print("\nIngrese el nombre de la clase: ");
            nombreClase = read.next();
            System.out.print("Ingrese la calificacion de la clase: ");
            notaClase = read.nextInt();
            arregloClases.add(indice, nombreClase);
            arregloNotas.add(indice, notaClase);
            
            //System.out.println("\nEl nombre de la materia es: "+
            //        arregloClases.get(indice)+ " con una nota de: "+
            //        arregloNotas.get(indice)+"con indice: "+ indice);
            System.out.println("\nDesea ingresar otra materia? S/N");
            seguir = read.next();
            if(arregloNotas.get(indice)>=max){
                max=arregloNotas.get(indice);
                notasMaximas.add(max);
                clasesMaximas.add(arregloClases.get(indice));
            }
            indice++;
            
        }
        System.out.println("La clase con puntuacion mas alta es: "+ 
                clasesMaximas.toString() +" con una nota de: "+ 
                notasMaximas.toString());
        
        for(Integer r: arregloNotas){
            promedio += r;
        }
        System.out.println("El promedio de calificaciones es de: "
                + promedio/arregloNotas.size());
    }
    
}
