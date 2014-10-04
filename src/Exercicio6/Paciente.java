/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exercicio6;

/**
 *
 * @author aleaguado
 */
public class Paciente
   { 
   private String nome;
   private int prioridade;
//--------------------------------------------------------------
   public Paciente (String n, int p)
      {                            
      nome = n;
      prioridade = p;
      }
//--------------------------------------------------------------
   public String displayPaciente()
      {
      String info = "   Nome: " + nome + ", Prioridade: " + prioridade;
      return info;
      }
//--------------------------------------------------------------

      public int getPrioridade()           // comentario aqui
      { return prioridade; }
   }  // Final da Classe Pessoa