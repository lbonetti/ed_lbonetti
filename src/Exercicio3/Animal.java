/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exercicio3;

/**
 *
 * @author aleaguado
 */
public class Animal
   { 
   private String nome;
   private String cor;
   private double tamanho;
//--------------------------------------------------------------
   public Animal(String n, String c, double t) //construtor da classe animal
      {                               
      nome = n;
      cor = c;
      tamanho = t;
      }
//--------------------------------------------------------------
   public void displayAnimal() //metodo para exibir os atributos de um animal
      {
      System.out.print("   Nome: " + nome);
      System.out.print(", Cor: " + cor);
      System.out.println(", Tamanho: " + tamanho);
      }
//--------------------------------------------------------------
   public String getNome() //metodo que retorna o nome do animal
      { return nome; }
   
   public String getCor() //metodo que retorna a cor do animal
      { return cor; }
   
   public double getTamanho() //metodo que retorna o tamanho do animal
      { return tamanho; }
   }  // Final da Classe Animal