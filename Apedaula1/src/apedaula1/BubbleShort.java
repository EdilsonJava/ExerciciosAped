/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apedaula1;

/**
 *
 * @author Edilson
 */
public class BubbleShort {
    private int[] vetor;

   
     public BubbleShort(int[] vetor) {
         
         this.vetor= vetor;
         
         
    }
    public int[] getVetor() {
        return vetor;
    }

   
    

    public void setVetor(int[] vetor) {
        this.vetor = vetor;
    }
    
     public void ordenar(int i, int j){
        
        if(i<this.vetor.length){
             if(j<this.vetor.length){
                if(this.vetor[i]>=this.vetor[j]){
                    int aux=this.vetor[i];
                   this.vetor[i]=this.vetor[j];
                   this.vetor[j]= aux;
                    ordenar(i,j+1);
                 }else{
                     ordenar(i,j+1);
                }
                
            }else {
                  ordenar(i+1,i+2);
            }
      }
     
       
    }
    
    
}
