/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apedaula1;

import static apedaula1.Exercicios.selectionRecursivo;
import java.util.Scanner;

/**
 *
 * @author Edilson
 */
public class Apedaula1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      
     // aula2.rec(10);
  
  SelectionShort aula2 = new SelectionShort(new int[10]);
     
        InsercionShort aula3 = new InsercionShort(new int[10]);
           for (int i = 0; i < 10; i++) {
            aula3.getVetor()[i]=(int)(Math.random()*100);
        }
        System.out.println("Array desordenado");
        for (int i = 0; i < 10; i++) {
            System.out.println(aula3.getVetor()[i]);
        }
        System.out.println("Array ordenado");
        aula3.ordenar();
         for (int i = 0; i < 10; i++) {
            System.out.println(aula3.getVetor()[i]);
        }
        
    
}
}