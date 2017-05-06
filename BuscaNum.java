/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscanum;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class BuscaNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int buscar;
        int Encontrado=0;
        int numArreglo;
        int totalArreglo;
        System.out.println("Numero total del arreglo");
        totalArreglo=sc.nextInt();
        int arreglo[]= new int [totalArreglo];
        
        for(int i=0;i<arreglo.length;i++){
            System.out.println("Ingrese numero de celda "+i);
            numArreglo=sc.nextInt();
            arreglo[i]=numArreglo;
        }
        System.out.println("Busque si su numero esta");
        buscar=sc.nextInt();
        for(int j=0;j<arreglo.length;j++){
        if(buscar==arreglo[j]){
        Encontrado++;
        }
        }
        if(Encontrado==0){
            System.out.println(buscar+" no se encuentra en el arreglo");
        }else{
            System.out.println(buscar+" si se encontra en el arreglo");
        }
        
    }
    
}
