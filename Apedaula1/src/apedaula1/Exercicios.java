/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apedaula1;

import java.util.Arrays;

/**
 *
 * @author Edilson
 */
public class Exercicios {
    
    private int[] array;

    public Exercicios(int[] array) {
        this.array = array;
    }
    public Exercicios(){};
    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
    
  public int funcao4(int n) { 
        int i, k = 0; 
        i = 1; while (i < n) {
             k += 1; 
             i = i * 2; 
        }
return k;
   }
  // complexidade de O(log(n))
int funcao5(int n) { 
    int i, j, k, l = 0;
    for (i = 0; i < n; i++) {
        for (j = 0; j < n; j++) { 
            l += 1;
        }
}

    for (i = 0; i < n; i++) { 
        for (k = 0; k < n; k++) { 
            l += 1;
        }
    }
    return l;
}
//complexidade de O(2n^2)
public int funcao6(int n) {
    int i, j, l = 0; 
    for (i = 0; i < n; i++) { 
        for (j = 0; j < Math.sqrt(n); j++) { 
            l += 1;
        }
    }
    return l;
}
//complexidade O(n^3/2)
public int funcao7(int[] array ){
    int s=0;
    int  n= array.length;
  
    for(int i=0; i<n;i++){
        s+=array[i];
    
    }
    return s;
  }
//Complexodade O(n)
public int funcao8(int[] array ){
    int s=0;
    int  n= array.length;
    for(int i=0; i<n;i+=2){
        s+=array[2*i];
        if(i>0){
            s+=array[2*i-1];
        }
    
    }
    return s;
    }

    public void rec(int n){
        if(n>0){
            System.out.println(n);
            rec(n-1);
            
        }
    }
    public void leitura(int[] array, int i)
    {
     
      
      if(i<array.length){
          System.out.println(array[i]);
          leitura(array,i+1);
          
      }
    }
    public void factorial(int f,int i){
        
        if (i>1){
            factorial(i*f,i--);
            
        }
           
    }
 
   
  
   public int[] repartirVetor(int[] array,int metade, int elemento){
       
       if(array[metade]>=elemento){
          if(metade!=array.length-1){
              int[] novoArray = Arrays.copyOf(array, array.length-1);
              return repartirVetor(novoArray,metade,elemento);
          } else{
             return array;
          } 
       }else {
           if(metade!=array.length-1){
               int[] novoArray2= removerElemento(array,0);
               return repartirVetor(novoArray2, metade, elemento);
           
           }else{
           return array;
           }
           
       }
   
   }
   
    private int[] removerElemento(int[] vetor, int posicao){
         for(int i=0; i<vetor.length-1; i++){
            
             if(i>=posicao){
                 vetor[i]=vetor[i+1];
             }
         }       
         int[] copia = Arrays.copyOf(vetor,vetor.length-1);
         return copia;
    }
    
    public void anagrama(String prefixo,String palavra){
        int n=palavra.length();
        if(n==0){
            System.out.println(prefixo);
            
        }else{
            for (int i = 0; i < n; i++) {
                anagrama(prefixo+palavra.charAt(i),palavra.substring(0,i)+palavra.substring(i+1,n));
            }
        }
    
    }
    public void torreDeHanoi(int numeroDeDiscos,String inicio, String fim, String  aux){
    
        
     if(numeroDeDiscos==1){
         
         System.out.println("Mova o disco 1 de "+inicio+" para "+fim );
     
     }else{
         torreDeHanoi(numeroDeDiscos-1, inicio, aux, fim);
          System.out.println("Mova o disco "+numeroDeDiscos+" de "+inicio+" para "+fim );
          torreDeHanoi(numeroDeDiscos-1, aux, fim, inicio);
     }
    }
     public int[] bubbleshortRecursivo(int[] vetorDesordenado,int i, int j){
        if(i<vetorDesordenado.length){
             if(j<vetorDesordenado.length){
                if(vetorDesordenado[i]>=vetorDesordenado[j]){
                    int aux=vetorDesordenado[i];
                   vetorDesordenado[i]=vetorDesordenado[j];
                   vetorDesordenado[j]= aux;
                   return bubbleshortRecursivo(vetorDesordenado,i,j+1);
                 }else{
                    return bubbleshortRecursivo(vetorDesordenado,i,j+1);
                }
                
            }else {
                 return bubbleshortRecursivo(vetorDesordenado,i+1,i+2);
            }
      }
     
       return vetorDesordenado;
    }
  
        public static int[] selectionRecursivo(int[] array, int n) {
        if (n <= 1) {
            return array;
        }

        int indiceMenor = 0;
        for (int i = 1; i < n; i++) {
            if (array[i] < array[indiceMenor]) {
                indiceMenor = i;
            }
        }

        // troca os elementos se necessário
        int temp = array[indiceMenor];
        array[indiceMenor] = array[n-1];
        array[n-1] = temp;

       return selectionRecursivo(array, n - 1);
    }
}

//complexidade O(log(n))
