/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exercicio4;

/**
 *
 * @author Lucas
 */
public class Logistica {
   private int tamanho; 
   public Logistica(int n){
       tamanho = n; //construtor de Logistica onde recebe o tamanho da pilha
   }
   
   Pilha a = new Pilha(tamanho); //instancia do objeto do tipo Pilha
    
    public void insert(String dest){
        a.inserir(dest); //insere na ultima posicao da pilha
    }
    
    public String definirRota(){
        String retorno =  "\n Prezado Jose, sua rota deverá ser feita na seguinte ordem de destinos: ";
        while (a.estaVazio()==false){
            retorno = retorno + "\n" + a.pegaitem(); //pega o item no top da pilha
            a.remove(); //remove o item da pilha
        }
        return retorno;
    }
   
}
