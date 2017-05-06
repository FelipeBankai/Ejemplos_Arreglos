/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglosejemplos;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class ArreglosEjemplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int primerNota;
        int segundoNota;
        int tercerNota;
        int promedioAlumno;
        int eleccion;
        int estudiante[]=new int [5];
        
        for(int i=0; i<estudiante.length;i++){
            System.out.println("Notas del alumno "+(i+1));
            System.out.println("Primer semestre nota?");
            primerNota=sc.nextInt();
            System.out.println("Segundo semestre semestre nota?");
            segundoNota=sc.nextInt();
            System.out.println("Tercer semestre nota?");
            tercerNota=sc.nextInt();
            
            promedioAlumno=(primerNota+segundoNota+tercerNota)/3;
        
            estudiante[i]=promedioAlumno;
        }
        System.out.println("Desea saber promedio de algun alumno");
        eleccion=sc.nextInt();
        System.out.println(estudiante[eleccion-1]);
    }
    
}
