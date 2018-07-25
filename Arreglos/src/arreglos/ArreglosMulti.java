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
public class ArreglosMulti {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[][] arrays = new int[5][5];
        arrays[0][0]=1;
        arrays[1][1]=2;
        arrays[2][2]=3;
        arrays[3][3]= rnd.nextInt(5);
        arrays[4][4]= rnd.nextInt(5);
        
        System.out.println("ssssssssssssssss");
        
        
        for(int j=0; j<5;j++){
            for(int x=0;x<0;x++){
                arrays[j][x] = rnd.nextInt(5);
                System.out.println("ssssssssssssssss");
                System.out.println(arrays[j][x]);
            }
        }
        
        for(int i = 0; i<5;i++){
            System.out.println(arrays[i][i]);
        }
        
    }
}
