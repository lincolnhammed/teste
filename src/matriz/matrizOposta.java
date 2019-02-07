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
public class matrizOposta {

    public static void main(String[] args) {
        int[][] matrizA = new int[3][4];

        Random random = new Random();
        System.out.println("matriz normal");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizA[i][j] = random.nextInt(50);
                System.out.print(matrizA[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println( "matriz oposta");
        int[][] oposta = new int[3][4];
        for (int i = 0; i < oposta.length; i++) {
            for (int j = 0; j < oposta[i].length; j++) {
                oposta[i][j] = matrizA[i][j]*(-1);
                System.out.print(oposta[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
