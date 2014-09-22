/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exercicio4;

/**
 *
 * @author aleaguado
 */
public class Pilha {
   private int maxSize;        // tamanho do array
   private String[] pilhaArray;   //vetor??? Isso mesmo ...usamos ele para implementar Pilha
   private int top;            // topo da Pilha
//--------------------------------------------------------------
   public Pilha(int s)         // construtor
      {
      maxSize = s;             // colocamos aqui o tamanho do vetor que servirá de Pilha
      pilhaArray = new String[maxSize];  // criamos aqui o vetor que servirá de Pilha
      top = -1;                // top vale -1 porque ainda não tem nenhum item!
      }
//--------------------------------------------------------------
   public void inserir(String j)    // insere um item no topo da Pilha
      {
      pilhaArray[++top] = j;     // increment a variavel top e naquela posição da Pilha já insere o valor
      //OBS: O sinal de ++ do lado esquerdo faz ele incrementar e depois retornar o valor de top
   }
//--------------------------------------------------------------
   public String remove()           // remove o item no topo da Pilha
      {
      return pilhaArray[top--];  // acessa o item e decrementa top
      //OBS: O sinal de -- do lado direito faz ele retornar o valor de top e depois decrementar
                                    //OBS: repare que na realidade não se remove nada, simplesmente, gerenciamos top 
                                    // para não ver mais esse item!!!
      }
//--------------------------------------------------------------
   public String pegaitem()          // pega item
      {
      return pilhaArray[top];       //retornará o item que esta no topo da Pilha
      }
//--------------------------------------------------------------
   public boolean estaVazio()    // metodo para verificar se a Pilha esta vazia
      {
      return (top == -1);       // retornará verdadeiro se top for igual a -1
      }
//--------------------------------------------------------------
   public boolean estaCheio()     // metodo para verificar se a Pilha esta cheia
      {
      return (top == maxSize-1);    //retornará verdadeiro se top for igual ao tamanho maximo -1
      }
//--------------------------------------------------------------
    
}
