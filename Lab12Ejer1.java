/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12ejer1;

import java.util.Scanner;

/**
 *
 * @author sala_28
 */
public class Lab12Ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N=10;
        int E;
        int i;
        int numCelda=0;
        int numeros[]=new int[N];
        boolean esta =false;
        Scanner sc=new Scanner(System.in);
        
        for(i=0;i<N;i++){
            System.out.println("Ingrese numero para la celda "+i+":");
            numeros[i]=sc.nextInt();
            
            }
        System.out.println("Ingrese numero a buscar:");
        E=sc.nextInt();
    
        for(i=0;i<N;i++){
            if(numeros[i]==E){
                esta=true;
                numCelda=numeros[i-1];
                break;
            }
        }
    if(esta=false){
        System.out.println("El numero "+E+" no esta e el arreglo");
    }
    else{
        System.out.println("El numero "+ E +" esta en el arreglo");
        System.out.println("en la celda "+numCelda);
    }
        
    }
    
}
