/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import com.sun.org.glassfish.external.statistics.Statistic;
import java.util.Random;

/**
 *
 * @author Lincoln
 */
public class matrizTransposta {

    static int[][] criaMatriz(int N, int M) {
        int soma;
        Random random = new Random();
        int[][] matriz = new int[N][M];
        for (int i = 0; i < matriz.length; i++) {
            soma = 1;
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = random.nextInt(100);
            }

        }
        return matriz;
    }

    static int[][] transposta(int[][] matriz) {
        int[][] matrizTransposta = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matrizTransposta.length; i++) {
            for (int j = 0; j < matrizTransposta[0].length; j++) {
                matrizTransposta[i][j] = matriz[j][i];
            }
        }
        return matrizTransposta;
    }

    static void imprimeMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matriz = criaMatriz(3, 4);
        imprimeMatriz(matriz);
        System.out.println();
        int[][] transposta = transposta(matriz);
         imprimeMatriz(transposta);
    }

}
