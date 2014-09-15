/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exercicio3;

/**
 *
 * @author Aluno
 */
public class EstruturaDados {
    
    private Animal[] a;                 // criamos a referência para um array Animal
    private int nElems;               // controla a qtd de itens no vetor
//--------------------------------------------------------------
    public EstruturaDados(int max){          // Método construtor
        a = new Animal[max];                    // Instancia um novo array
        nElems = 0;                        // coloca no inicio a variavel nElems c/ zero elemento
    }
//---------------------------------------------------------------    

//--------------------------------------------------------------
//Método que faz a inserção desordenada no vetor Animal....
//--------------------------------------------------------------
    public void insert(String n, String c, double t){
        a[nElems] = new Animal(n, c, t);
        nElems++;
    }
//---------------------------------------------------------------    
  
    //--------------------------------------------------------------
   // Rotina de Ordenação pelo método Bolha (BubbleSort)
   //-----------------------------------------------------------
   public void bubbleSort() //ordenação por nomes, utilizando o método BubbleSort
      {
      int out, in;

      for(out=nElems-1; out>1; out--)   // este for roda até que tenhamos certeza que até o primeiro item esta ordenado
         for(in=0; in<out; in++)        // este for que irá caminhar uma posição a direita comparando os itens
            if( a[in].getNome().compareToIgnoreCase(a[in+1].getNome()) > 0 ) // aqui que comparamos um valor com o outro e quando o próximo for maior
               swap(in, in+1);          // nós chamamos o método que faz a troca.
      }
//-----------------------------------------------------------------------------------------------
 
//----------------------------------------------------------------------------------------------
 //Rotina de busca binária por nome
//----------------------------------------------------------------------------------------------
   public int findName(String searchName)
      {
      int lowerBound = 0;
      int upperBound = nElems-1;
      int curIn;

      while(true)
         {
         curIn = (lowerBound + upperBound ) / 2;
         if(a[curIn].getNome().equalsIgnoreCase(searchName)){ //verifica se o nome nesta posição é igual ao nome informado pelo usuário
             for (int i = curIn; a[i].getNome().equalsIgnoreCase(searchName);i++){ //verifica a posição atual e as sucessoras enquanto o nome for igual
                 System.out.println("O nome " + a[i].getNome() + " foi encontrado na posição " + i ); //exibe o nome
                 if (i+1==nElems){ //verifica se está na útlima posição do array
                     break;} //caso esteja, sai da repetição, para evitar erro de Array out of Bounds (fora de alcançe)
                 }
             if (curIn!=0){ //verifica se todas as posições já foram varridas, pois se curIn for 0 ao decrementar 1 neste for vai dar erro
                for (int i = curIn-1; a[i].getNome().equalsIgnoreCase(searchName);i--){ //verifica a posição anterior e as antecessoras enquanto começar com a mesma letra
                    System.out.println("O nome " + a[i].getNome() + " foi encontrado na posição " + i ); //exibe o nome
                    if (i==0){ //verifica se está na primeira posição do array 
                        break;}//caso esteja, sai da repetição, para evitar erro de Array out of Bounds (fora de alcançe)
                }
            }
         return curIn;
         }  
         else if(lowerBound > upperBound)
            return nElems;             // não pude encontra-lo
         else                          // divide o range
            {
            if(a[curIn].getNome().compareToIgnoreCase(searchName) < 0) //ve se o nome na posição atual é menor que o passado no parâmetro
               lowerBound = curIn + 1; // esta na metade de cima
            else
               upperBound = curIn - 1; // esta na metade de baixo
            }  // fim do else de divisão de range
         }  // fim do while
      }  // fim do método de pesquisa binária para encontrar animais pelo nome()
//----------------------------------------------------------------------------------------------
   
//--------------------------------------------------------------
   // Rotina de Ordenação pelo método de Seleção (SelectionSort)
   //-----------------------------------------------------------
     public void selectionSort() //ordenação por cor utilizando SelectionSort
      {
      int out, in, min;

      for(out=0; out<nElems-1; out++)   // este for roda até que tenhamos certeza que até o ultimo item esta ordenado
         {
         min = out;                     // inicialmente a primeira posiçãp (out) é considerada a menor
         for(in=out+1; in<nElems; in++) // mas vamos varrer todos itens pra ter certeza ...
            if(a[in].getCor().compareToIgnoreCase(a[min].getCor ()) < 0) // e se encontrarmos um novo item menor
                min = in;               // ele irá para variavel min
         swap(out, min);                // e ao final colocamos o menor no lugar dele
         }  // end for(out)             // e seguimos o for até que todos estejam ordenados!!!    
      }  // end selectionSort()
   //--------------------------------------------------------------
   // Rotina de busca binária por cor
   //--------------------------------------------------------------
      public int findColor(String searchColor) 
      {
      int lowerBound = 0;
      int upperBound = nElems-1;
      int curIn;

      while(true)
         {
         curIn = (lowerBound + upperBound ) / 2;
         if(a[curIn].getCor().equalsIgnoreCase(searchColor)){ //verifica se o nome nesta posição é igual ao nome informado pelo usuário
             for (int i = curIn; a[i].getCor().equalsIgnoreCase(searchColor);i++){ //verifica a posição atual e as sucessoras enquanto o nome for igual
                 System.out.println("O animal " + a[i].getNome() + " de cor " + a[i].getCor() + " foi encontrado na posição " + i ); //exibe o nome
                 if (i+1==nElems){ //verifica se está na útlima posição do array
                     break;} //caso esteja, sai da repetição, para evitar erro de Array out of Bounds (fora de alcançe)
                 }
             if (curIn!=0){ //verifica se todas as posições já foram varridas, pois se curIn for 0 ao decrementar 1 neste for vai dar erro
                for (int i = curIn-1; a[i].getCor().equalsIgnoreCase(searchColor);i--){ //verifica a posição anterior e as antecessoras enquanto começar com a mesma letra
                    System.out.println("O animal " + a[i].getNome() + " de cor " + a[i].getCor() + " foi encontrado na posição " + i ); //exibe o nome
                    if (i==0){ //verifica se está na primeira posição do array 
                        break;}//caso esteja, sai da repetição, para evitar erro de Array out of Bounds (fora de alcançe)
                }
            }
         return curIn;
         }  
         else if(lowerBound > upperBound)
            return nElems;             // não pude encontra-lo
         else                          // divide o range
            {
            if(a[curIn].getCor().compareToIgnoreCase(searchColor) < 0) //ve se o nome na posição atual é menor que o passado no parâmetro
               lowerBound = curIn + 1; // esta na metade de cima
            else
               upperBound = curIn - 1; // esta na metade de baixo
            }  // fim do else de divisão de range
         }  // fim do while
      }  // fim do método de pesquisa binária para encontrar animais pela cor()
//----------------------------------------------------------------------------------------------
  
   //--------------------------------------------------------------
   // Rotina de Ordenação pelo método de Inserção (InsertSort)
   //-----------------------------------------------------------
      public void insertionSort() //ordenação pelo tamanho utilizando InsertionSort
      {
      int in, out;

      for(out=1; out<nElems; out++)     // vamos rodar até o final do vetor
         {
         Animal temp = new Animal(a[out].getNome(),a[out].getCor(),a[out].getTamanho());            // jogamos em uma variável temporária o item marcado
         in = out;                      // inicializamos a variavel in, que ira receber o valor a esquerda
         while(in>0 && a[in-1].getTamanho() >= temp.getTamanho()) // enquanto o item a esquerda for maior que o marcado ...
            {
            a[in] = a[in-1];            // ...nós fazemos eles pularem uma casa a direita
            --in;                       
            }                           // ... quando o item for menor, ele nao pula!
         a[in] = temp;                  // ...inserimos o valor marcado na posição que ficou "livre", ou seja,
                                        // onde estava o último item a esquerda maior que o marcado
         }  // end for
      }  // end insertionSort()
//--------------------------------------------------------------

   //--------------------------------------------------------------
   // Rotina de busca binária pelo tamanho
   //--------------------------------------------------------------
      public int findSize(double searchSize) 
      {
      int lowerBound = 0;
      int upperBound = nElems-1;
      int curIn;

      while(true)
         {
         curIn = (lowerBound + upperBound ) / 2;
         if(a[curIn].getTamanho()==searchSize){ //verifica se o nome nesta posição é igual ao nome informado pelo usuário
             for (int i = curIn;a[i].getTamanho()==searchSize;i++){ //verifica a posição atual e as sucessoras enquanto o nome for igual
                 System.out.println("O animal " + a[i].getNome() + " de tamanho " + a[i].getTamanho() + " foi encontrado na posição " + i ); //exibe o nome
                 if (i+1==nElems){ //verifica se está na útlima posição do array
                     break;} //caso esteja, sai da repetição, para evitar erro de Array out of Bounds (fora de alcançe)
                 }
             if (curIn!=0){ //verifica se todas as posições já foram varridas, pois se curIn for 0 ao decrementar 1 neste for vai dar erro
                for (int i = curIn-1;a[i].getTamanho()==searchSize;i--){ //verifica a posição anterior e as antecessoras enquanto começar com a mesma letra
                    System.out.println("O animal " + a[i].getNome() + " de tamanho " + a[i].getTamanho() + " foi encontrado na posição " + i ); //exibe o nome
                    if (i==0){ //verifica se está na primeira posição do array 
                        break;}//caso esteja, sai da repetição, para evitar erro de Array out of Bounds (fora de alcançe)
                }
            }
         return curIn;
         }  
         else if(lowerBound > upperBound)
            return nElems;             // não pude encontra-lo
         else                          // divide o range
            {
            if(a[curIn].getTamanho() < searchSize) //ve se o nome na posição atual é menor que o passado no parâmetro
               lowerBound = curIn + 1; // esta na metade de cima
            else
               upperBound = curIn - 1; // esta na metade de baixo
            }  // fim do else de divisão de range
         }  // fim do while
      }  // fim do método de pesquisa binária para encontrar animais pelo tamanho()
//----------------------------------------------------------------------------------------------

//----------------------------------------------------------------------------------------------
    private void swap(int one, int two) //Simples rotina onde é efetuada a troca no vetor!!!
      {
      Animal temp = new Animal(a[one].getNome(),a[one].getCor(),a[one].getTamanho()); 
      a[one] = a[two];
      a[two] = temp;
      }
//------------------------------------------------------------

//--------------------------------------------------------------
   public void display()             // rotina para imprimir na tela os itens existentes
      {
      for(int j=0; j<nElems; j++)       // para cada elemento
         a[j].displayAnimal();  // vamos imprimi-lo
      }
//--------------------------------------------------------------
    
//--------------------------------------------------------------
//Método que retorna quantidade de itens do vetor ....
//--------------------------------------------------------------
    public int size(){
        return nElems; }
//---------------------------------------------------------------    
    
}
