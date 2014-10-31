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
////////////////////////////////////////////////////////////////
class ListaDeNosApp
   {
   public static void main(String[] args)
      {
      ListaDeNos theList = new ListaDeNos();  // criamos uma nova lista

      theList.insertOrdenado("Lucas", "Jesus", 36);      // inserimos quatro itens nela
      theList.insertOrdenado("Luiz", "Anna", 54);
      theList.insertOrdenado("Deise", "Lourdes", 21);
      theList.insertOrdenado("Aline", "Deise", 87);

      theList.displayList();              // mostramos a lista
            
      }  // final do método main()
   }  // final da classe usuária
////////////////////////////////////////////////////////////////

