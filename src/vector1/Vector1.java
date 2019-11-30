/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vector1;

import java.util.Scanner;

/**
 *
 * @author Ismael Rivas H
 * Gestión de la Configuración del Software
 * 
 */
public class Vector1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] vector = new int[10];
        
        Scanner reader = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el número ["+i+"] a continuación: ");
            vector[i] = reader.nextInt();
        }
        System.out.println("\nVector ingresado:\n");
        for (int i = 0; i < 10; i++) {
            System.out.print(vector[i]+"\t");
        }
        int aux = 0;
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                if(vector[j]>vector[j+1]){
                     aux = vector[j+1];
                     vector[j+1] = vector[j];
                     vector[j] = aux;
                }
            }
        }
        System.out.println("\nVector ordenado:\n");
        for (int i = 0; i < 10; i++) {
            System.out.print(vector[i]+"\t");
        }
    }
}
