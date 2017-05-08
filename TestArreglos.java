/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testarreglos;

import java.util.Scanner;

/**
 *
 * @author dci
 */
public class TestArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numNotas;
        double valorNotas;
        double promedio=0;
        double minimo=99;
        System.out.println("Ingrese cantidad de notas a promediar");
        numNotas=sc.nextInt();
        double notas[]=new double [numNotas];
        for(int i=0;i<notas.length;i++){
            System.out.println("Ingrese nota "+(i+1));
            valorNotas=sc.nextDouble();
            notas[i]=valorNotas;
        }
        for(int j=0;j<notas.length;j++){
            
            promedio=notas[j]+promedio;
        
        }
        promedio=(double)promedio/notas.length;
        
        System.out.println("Las notas ingresadas fueron");
        for(int l=0;l<notas.length;l++){
        
            System.out.println(notas[l]);
            
        }
        
        System.out.println("Su promedio es "+promedio);
        
        for(int f=0;f<notas.length;f++){
            if(notas[f]<minimo){
            minimo=(double)notas[f];
            }
        
        }
        System.out.println("La nota minima fue");
        System.out.println(minimo);
    }
    
}
