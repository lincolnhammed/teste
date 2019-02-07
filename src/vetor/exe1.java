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
public class exe1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
     int [] vetorA=new int[5];
     int [] vetorB=new int[vetorA.length];

         
        for(int i=0;i<vetorA.length;i++){
            
            System.out.print((i)+"\t");
            vetorA[i] =scan.nextInt();         
        }
       System.out.println("vetor b");
        for(int i=0; i<vetorA.length;i++){
            vetorB[i]=vetorA[i];
            System.out.print(vetorB[i]);
        }        
        
    }
    
}
