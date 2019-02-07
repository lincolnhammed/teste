/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor;

import java.util.Scanner;

/**
 *
 * @author Lincoln
 */
public class exe2 {

    public static void main(String[] args) {
        int[] vetorA = new int[8];
        int[] vetorB = new int[vetorA.length];

        Scanner scan = new Scanner(System.in);
        for (int i = 1; i < vetorA.length; i++) {
            System.out.println("digite um numero na posicao " + (i));
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i] * 2;

        }

        System.out.println("vetor a");
        for (int i = 1; i < vetorA.length; i++) {
            System.out.print(vetorA[i]);
        }
        System.out.println("vetor b");
        for (int i = 1; i < vetorA.length; i++) {
            System.out.println(vetorB[i]);
        }

    }

}
