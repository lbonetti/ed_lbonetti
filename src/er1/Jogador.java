/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package er1;

/**
 *
 * @author Aluno
 */
public class Jogador {
   private String nome;
   private float altura;
   private int idade;
//--------------------------------------------------------------
   public Jogador(String nome, float altura, int idade)
      {                               // constutor da classe pessoa
      this.nome = nome;
      this.altura = altura;
      this.idade = idade;
      }
//--------------------------------------------------------------
   public void displayJogador()
      {
      System.out.print("   Nome: " + nome);
      System.out.print(", Altura: " + altura);
      System.out.println(", Idade: " + idade);
      }
//--------------------------------------------------------------
   public int getAge()           // método que retorna a idade
      { return idade; }
}   //end class Jogador
