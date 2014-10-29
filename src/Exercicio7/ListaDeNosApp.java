/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exercicio7;

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

      theList.insertFirst("Lucas", "Jesus");      // inserimos quatro itens nela
      theList.insertFirst("Luiz", "Anna");
      theList.insertFirst("Deise", "Lourdes");
      theList.insertFirst("Aline", "Deise");

      theList.displayList();              // mostramos a lista
      
      if(!theList.search("Lucas")) //busca o nó que possue o nome Lucas
              System.out.println("Nome não encontrado");
      if(!theList.search("Aline")) //busca o nó que possue o nome Aline
              System.out.println("Nome não encontrado");
      if(!theList.search("Gerosvina")) //busca o nó que possue o nome Gerosvina (não existe)
              System.out.println("\nNome não encontrado\n");

      while( !theList.isEmpty() )         // until it's empty,
         {
         No aLink = theList.deleteFirst();   // deletamos o primeiro nó da lista e colocamos em aLink
         System.out.print("Deletado ");         // 
         aLink.displayNo();                     // mostramos o nó deletado
         System.out.println("");
         }
      theList.displayList();              // mostramos a lista
      }  // final do método main()
   }  // final da classe usuária
////////////////////////////////////////////////////////////////

