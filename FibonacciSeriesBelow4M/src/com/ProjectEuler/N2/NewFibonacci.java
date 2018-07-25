package com.ProjectEuler.N2;

/**
 * @author Ricardo Guardiola
 */
public class NewFibonacci {
    
    public static void main(String[] args) {
        int fb1 = 0; //fb1 = Primer numero de la serie de Fibonnaci
        int fb2 = 1; //fb2 = Segundo numero de la serie de Fibonacci
        int acumulador = 0; // Variable que contendra la serie de Fibonacci pero solo los numeros pares
        int series = 0; // Variable que contendra toda la serie de Fibonacci <4M
       while(series <4000000)
       {
            series = fb1+fb2; //La serie se inicializa
            fb1=fb2; //fb1 toma el valo de fb2
            fb2=series; //fb2 toma el valor actual de la serie de Fibonacci
            System.out.println(series); //se muestra en pantalla el valor de la serie
           if(series%2==0)
           {
               acumulador+=series; // como la serie es un numero PAR estonces se le suma ese valor al acumulador
               System.out.println("Se suma: " + series + " al Acumulador"); //Se imprime el valor a sumar
           }
           else
           {
              //No hace nada
           }
       }
       
        System.out.println("\tLa Respuesta es: " +acumulador);// SE muestra el resultado final
    }
    
}
