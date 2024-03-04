/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apedaula1;

/**
 *
 * @author Edilson
 */
public class InsercionShort {
    private int[] vetor;

    public InsercionShort(int[] vetor) {
        this.vetor = vetor;
    }

    public int[] getVetor() {
        return vetor;
    }

    public void setVetor(int[] vetor) {
        this.vetor = vetor;
    }
    public void ordenar(){
        int aux,j;
        for (int i = 1; i < vetor.length; i++) {
           aux=vetor[i];
           j=i-1;
           while(j>=0 && this.vetor[j]>aux){
               this.vetor[j+1]=this.vetor[j];
               j--;
           }
           this.vetor[j+1]=aux;
        }
    
}
    }
    

