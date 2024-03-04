/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apedaula1;

/**
 *
 * @author Edilson
 */
public class SelectionShort {
    private int[] vetor;
    private boolean vetorOrdenado;

    public SelectionShort(int[] vetor) {
        this.vetor = vetor;
    }
    public SelectionShort(){

    }
    
    public int[] getVetor() {
        return this.vetor;
    }

    public void setVetor(int[] vetor) {
        this.vetor = vetor;
    }
    public void ordenar(){
        int posicaomenor;
        for(int i=0;i<vetor.length;i++){
            posicaomenor=i;
            for(int j=i+1; j<this.vetor.length;j++){
                if(this.vetor[j]<this.vetor[posicaomenor]){
                    posicaomenor=j;
                }
            }
            int aux= this.vetor[i];
            this.vetor[i]=this.vetor[posicaomenor];
            this.vetor[posicaomenor]=aux;
        }
        this.vetorOrdenado=true;
    }
    public void mediana(){
       if(this.vetorOrdenado){
            if(this.vetor%2==0){
                
            }
       }
    }
}
