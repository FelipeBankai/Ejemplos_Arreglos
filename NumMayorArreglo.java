/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nummayorarreglo;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class NumMayorArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numTotal;
        int numMax=0;
        int numIngresado;
        System.out.println("Cuantos numeros desea ingresar");
        numTotal=sc.nextInt();
        int num[]=new int [numTotal];
        for(int i=0;i<num.length;i++){
            System.out.println("Numero "+(i+1));
            numIngresado=sc.nextInt();
            num[i]=numIngresado;
        }
        for(int j=0;j<num.length;j++){
            if(num[j]>numMax){
            numMax=num[j];
            }
        }
        System.out.println("El mayor de los numeros es "+numMax);
        
    }
    
}
