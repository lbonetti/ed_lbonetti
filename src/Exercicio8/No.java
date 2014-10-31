/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exercicio8;

import Exercicio7.*;

/**
 *
 * @author aleaguado traduzido de Robert Lafore
 */
class No
   {
   private String nome;              // vai armazenar um valor numerico qualquer
   private String pessoaquerida;           // vai armazenar um valor numerico qualquer
   private int idade;
   private No next;              // referência para o próximo item da lista
   
// -------------------------------------------------------------
   public No(String nome, String pessoaquerida, int idade) // metodo construtor
      {
      this.nome=nome;                 // initializa os dois atributos do No
      this.pessoaquerida=pessoaquerida;                 // o No next a principio fica como null
      this.idade = idade;
      }                           // 
// -------------------------------------------------------------
   public void displayNo()      // mostra os valores do proprio nó
      {
      System.out.print("{ Nome: " + nome + ", Pessoa querida: " + pessoaquerida + ", Idade: " + idade+"} ");
      }
   
   public String displayNome(){ //retorna o nome presente no nó
       return nome;
   }
   
   public int displayIdade(){ //retorna a idade presente no nó
       return idade;
   }
   
   public void setNext(No n){
       next = n;
   }
   
   public No getNext(){
       return next;
   }   
   }  // fim da classe nó
////////////////////////////////////////////////////////////////