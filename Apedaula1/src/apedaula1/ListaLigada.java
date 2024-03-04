/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apedaula1;

/**
 *
 * @author Edilson
 */
public class ListaLigada {
    private Elemento primeiro;
    private Elemento ultimo;
    private int tamanho;

    public ListaLigada(){
        this.tamanho=0;
    }
    public Elemento getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(Elemento primeiro) {
        this.primeiro = primeiro;
    }

    public Elemento getUltimo() {
        return ultimo;
    }

    public void setUltimo(Elemento ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    public void adicionar(int novoValor){
       Elemento novoElemento= new Elemento(novoValor);
        if (this.primeiro==null && this.ultimo==null) {
            this.primeiro=novoElemento;
            this.ultimo=novoElemento;
            
        } else {
            this.ultimo.setProximo(novoElemento);
            this.ultimo=novoElemento;
            
        }
        this.tamanho++;
    }
    public void remover (int posicao){
        Elemento anterior= null;
        Elemento atual = this.primeiro;
        for(int i=0; i<posicao; i++){
            if(atual.getProximo()!=null){
                anterior=atual;
                atual=atual.getProximo();
            }     
           
        }
        if(this.primeiro==atual){
            this.primeiro=null;
            this.ultimo=null;
            atual=null;
        }else if(this.ultimo==atual){
           this.ultimo=anterior;
           this.ultimo.setProximo(null);
            anterior=null;      
        }else{
            anterior.setProximo(atual.getProximo());
            atual=null;
        }
        
       this.tamanho--;
      
       }
    public Elemento get(int posicao){
        Elemento atual = this.primeiro;
        for(int i=0; i<posicao; i++){
            if(atual.getProximo()!= null){
                atual=atual.getProximo();
                
            } 
        }
        return atual;
    }
    
}
