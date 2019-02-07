/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import java.util.Random;

/**
 *
 * @author Lincoln
 */
public class matristransposta1 {

    public static void main(String[] args) {
        int[][] matrizA = new int[3][4];
        
        Random random = new Random();
        
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizA[i][j] = random.nextInt(50);
                 System.out.print( matrizA[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
         int[][] matrizTransposta = new int[4][3];
         for (int i = 0; i < matrizTransposta.length; i++) {
            for (int j = 0; j < matrizTransposta[i].length; j++) {
                matrizTransposta[i][j] = matrizA[j][i];
                 System.out.print( matrizTransposta[i][j]+"\t");
            }
            System.out.println();
        }
        
        
        
        
        

    }
}
