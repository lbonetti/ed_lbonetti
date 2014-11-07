/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exercicio8;

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
      
      if(!theList.searchNome("Deise")) //busca por nome, que existe na lista
              System.out.println("Nó não econtrado.");
              System.out.println("\n");
      
      if(!theList.searchNome("Mario")) //busca por nome, que não existe na lista
              System.out.println("Nó não econtrado.");
      
      if(!theList.searchIdade(87)) //busca por idade, que existe na lista
              System.out.println("Nó não econtrado.");
              System.out.println("\n");
      
      if(!theList.searchIdade(99)) //busca por idade, que não existe na lista
              System.out.println("Nó não econtrado.");
      
          System.out.print(theList.delete("Aline")); //deletando um nó que existe na lista
          System.out.print(theList.delete("Lucas")); //deletando um nó que existe na lista
          System.out.print(theList.delete("Gervásio")); //deletando um nó que não existe na lista
          
          theList.displayList(); //exibe a lista
          
          System.out.println("\n");
          System.out.println("Caríssimo professor, não implementei a busca binária pois pelo que li no livro e pesquisei "
                  + "sobre o assunto isso não seria uma boa prática na estrutura de dados, visto que para busca binária "
                  + "funcionar os elementos precisam ter um índice para que possam ser acessados em qualquer posição, e a  "
                  + "ideia da lista encadeada é termos a referencia apenas para o primeiro nó, ou no caso da lista encadeada "
                  + "com extremidade duplas o primeiro e o último nó, com cada nó guardando a referência para seu próximo. "
                  + "Resumindo, tem como implementar busca binária na lista encadeada, porém não seria uma boa prática.");

          
            
      }  // final do método main()
   }  // final da classe usuária
////////////////////////////////////////////////////////////////

