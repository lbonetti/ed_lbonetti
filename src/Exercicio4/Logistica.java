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
   
    Pilha a;
   
   public Logistica(int n){
       a = new Pilha(n); //instancia do objeto Pilha
   }
   
    
    public void insert(String dest){
        a.inserir(dest); //insere na ultima posicao da pilha
    }
    
    public String definirRota(){ //metodo que define a melhor rota a ser percorrida
        String retorno =  "\n Prezado Jose, sua rota deverá ser feita na seguinte ordem de destinos: ";
        int i=1;
        while (a.estaVazio()==false){ //enquanto a pilha não estiver vazia
            retorno = retorno + "\n" + i + ". " + a.pegaitem(); //pega o item no top da pilha e coloca ele na rota
            a.remove(); //remove o item da pilha
            i++;
        }
        return retorno;
    }
   
}
