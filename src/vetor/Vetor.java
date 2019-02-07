/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor;

/**
 *
 * @author Lincoln
 */
public class Vetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double tempDia001 =31.3;
        double tempDia002 =32;
        double tempDia003 =33.7;
        double tempDia004 =34;
        double tempDia005 =33.1;
        
        double[] temperaturas = new double[365];
        temperaturas[0]=31.3;
        temperaturas[1]=32;
        temperaturas[2]=33.7;
        temperaturas[3]=34;
        temperaturas[4]=33.1;
        
        System.out.println("o valor da temperatura dia 1 é " +temperaturas[0]);
        
        System.out.println("tamanho do vetor " + temperaturas.length);
        
        System.out.println("Valores vetor " +temperaturas);
        
//        for(int i=0;i< temperaturas.length;i++){
//            System.out.println("o valor da temperatura do dia " +(i+1)+" é " + temperaturas[i]);
//            
//        }
        for(double temp : temperaturas){
            System.out.println(temp);
        }
                                        
        
        
    }
    
}
