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
class ListaDeNos
   {
   private No first;            // criamos uma referencia para o primeiro nó da lista
// -------------------------------------------------------------
   public ListaDeNos()              // metodo construtor
      {
      first = null;               // quando construido o primeiro nó fica como NULL, porque não tem nada!
      }
// -------------------------------------------------------------
   public boolean isEmpty()       // se o primeiro (first) nó estiver como NULL
      {                             // estará vazia
      return (first==null);
      }
// -------------------------------------------------------------                                
   public void insertOrdenado(String nome, String pessoaquerida, int idade)  // insere em ordem
      {                           
        No newNo = new No(nome, pessoaquerida, idade); //novo nó
        No current = first; //referencia para o nó atual
        No previous = null; //referencia para o nó anterior
        
        while(current!=null && current.displayIdade()<idade){ //percorre a lista até o final ou até que uma idade maior seja encontrada
            previous=current; //guarda o nó anterior
            current=current.getNext(); //vai para o próximo nó
        }
        if (previous==null) //se o nó deve ser inserido no início da lista ou a lista estiver vazia, previous será null
            first = newNo; //o novo nó se torna o first
        else
            previous.setNext(newNo); //o nó anterior é referenciado ao novo ítem
        
        newNo.setNext(current);  //o novo nó aponta para seu sucessor
      }
// -------------------------------------------------------------
   public No deleteFirst()      // removemos o primeiro nó
      {                           // assumimos que a lista não esta vazia!
      No temp = first;          // o primeiro nó vai p/ variavel temporária
      first = first.getNext();         // o segundo nó se torna o novo primeiro
      return temp;                // retornarmos para classe usuária o item removido
      }
// -------------------------------------------------------------
   public String delete(String nome)      // buscamos e removemos o nó que tiver o nome passado por parâmetro
      {                           // assumimos que a lista não esta vazia!
      String result = "\nNó não encontrado";
      No current = first; //rerefencia para o nó corrente
      No previous = first; //referencia para o anterior
      
      while(current.displayNome() != nome){ //buscamos o nó. executa a repetição enquanto não encontrar o nó
          if(current.getNext() == null)
              return result; //não encontrou. retorna result e sai do método
          else{
              previous = current; //guarda a referencia ao anterior
              current = current.getNext(); //vai para proximo nó
          } 
      } //se encontrou, sai do while
      
      if(current == first) //se for o primeiro nó
          first = first.getNext(); //apenas desconsidera o primeiro nó
      else
          previous.setNext(current.getNext()); //senão, seta o next do nó a ser apagado como next do nó anterior
      
      result="\nNó apagado com sucesso";
      return result;
   }
// -------------------------------------------------------------
   public void displayList()
      {
      System.out.print("\nLista (primeiro-->último): ");
      No current = first;       // começamos pelo começo da lista
      while(current != null)      // enquanto não chegarmos no item null ...
         {
         current.displayNo();   // mostramos o item
         current = current.getNext();  // movemos a lista para o proximo
         }
      System.out.println("");
      }
// -------------------------------------------------------------
      public boolean searchNome(String nome) //método que busca o nó com o nome passado por parâmetro
      {
      boolean status=false;
      No current = first;       // começamos pelo começo da lista
      while(current != null)      // enquanto não chegarmos no item null ...
         {
         if(current.displayNome().equalsIgnoreCase(nome)){ //compara se o nome do nó é igual ao passado por parâmetro
             System.out.println("\nResultado encontrado: ");
             current.displayNo();   // caso encontre, exibe o ítem
             status=true;}
         current = current.getNext();  // movemos a lista para o proximo
         }
      return status;
      }
// -------------------------------------------------------------      
      public boolean searchIdade(int idade) //método que busca o nó com a idade passada por parâmetro
      {
      boolean status=false;
      No current = first;       // começamos pelo começo da lista
      while(current != null)      // enquanto não chegarmos no item null ...
         {
         if(current.displayIdade()==idade){ //compara se a idade do nó é igual ao passado por parâmetro
             System.out.println("\nResultado encontrado: ");
             current.displayNo();   // caso encontre, exibe o ítem
             status=true;}
         current = current.getNext();  // movemos a lista para o proximo
         }
      return status;
      }
// -------------------------------------------------------------

   }  // fim da classe Lista de Nós
//////////////////////////////////////////////////////////////