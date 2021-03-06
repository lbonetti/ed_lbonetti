package Exercicio2;
// vetorordenado.java
// demonstra a utilização de um ordenado com pesquisa binária
////////////////////////////////////////////////////////////////
 //--------------------------------------------------------------
//Iniciamos aqui a classe VetorOrdenado! Nossa nova Estrutura de Dados!!
//--------------------------------------------------------------
class VetorOrdenado
   {
   private String[] a;                 // cria a referência a para um vetor long
   private int nElems;               // variavel para controlar o numero de elementos
   //-----------------------------------------------------------
   public VetorOrdenado(int max)          // metodo construtor
      {
      a = new String[max];             // cria o array
      nElems = 0;
      }
   //--------------------------------------------------------------
//Método para retornar quantos elementos tem no vetor
//--------------------------------------------------------------
   public int size()
      { return nElems; }
//--------------------------------------------------------------
//Método de pesquisa binária ....
//--------------------------------------------------------------
   public int find(String searchKey)
      {
      int lowerBound = 0;
      int upperBound = nElems-1;
      int curIn;

      while(true)
         {
         curIn = (lowerBound + upperBound ) / 2;
         if(a[curIn].charAt(0)==searchKey.charAt(0)){ //verifica se o nome nesta posição começa com a letra informada pelo usuário
             for (int i =curIn; a[i].charAt(0)==searchKey.charAt(0);i++){ //verifica a posição atual e as sucessoras enquanto começar com a mesma letra
                 System.out.println("O nome " + a[i] + " começa com " + searchKey.charAt(0)); //exibe o nome
                 if (i+1==nElems){ //verifica se está na útlima posição do array
                     break;} //caso esteja, sai da repetição, para evitar erro de Array out of Bounds (fora de alcançe)
                 }
             if (curIn!=0){ //verifica se todas as posições já foram varridas, pois se curIn for 0 ao decrementar 1 neste for vai dar erro
                for (int i =curIn-1; a[i].charAt(0)==searchKey.charAt(0);i--){ //verifica a posição anterior e as antecessoras enquanto começar com a mesma letra
                    System.out.println("O nome " + a[i] + " começa com " + searchKey.charAt(0)); //exibe o nome
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
            if(a[curIn].compareTo(searchKey) < 0)
               lowerBound = curIn + 1; // esta na metade de cima
            else
               upperBound = curIn - 1; // esta na metade de baixo
            }  // fim do else de divisão de range
         }  // fim do while
      }  // fim do método de pesquisa binária()
//--------------------------------------------------------------
//Método de inserção ORDENADA!!! ....
//--------------------------------------------------------------
   public void insert(String value)    // insere o elemento no vetor
      {
      int j;
      for(j=0; j<nElems; j++)        // localiza onde esse elemento se encaixa
         if(a[j].compareTo(value) > 0)            // OBS: Usando aqui busca linear!!! Poderia ser binária!
            break;
      for(int k=nElems; k>j; k--)    // move os elementos maiores uma posição p/ frente
         a[k] = a[k-1];
      a[j] = value;                  // insere o elemento na posição necessária
      nElems++;                      // incrementa a variavel de controle de tamanho
      }  // finaliza o método de inserção
 //--------------------------------------------------------------
//Método de remoção, utilizando busca binária.
//--------------------------------------------------------------  
   public int delete(String value)
      {
      int lowerBound = 0;
      int upperBound = nElems-1;
      int curIn;

      while(true)
         {
         curIn = (lowerBound + upperBound) / 2;
         if(a[curIn].equals(value)){ //ao encontrar o nome digitado faça:
             if (curIn==nElems-1){ //verifica se esse elemento não é o último do array
                 nElems--; //caso seja, apenas descondiera o último elemento, não traz os mais altos para "frente"
             }
             else{ //senao
             for(int k=curIn; k<nElems; k++) // move os elementos uma posição pra tras
                 a[k] = a[k+1];
             nElems--;  // decrementa o tamanho
             }
             return curIn;   
         }
         else if(lowerBound > upperBound)
            return nElems;             // não pude encontra-lo
         else                          // divide o range
            {
            if(a[curIn].compareTo(value) < 0)
               lowerBound = curIn + 1; // esta na metade de cima
            else
               upperBound = curIn - 1; // esta na metade de baixo
            }  // fim do else de divisão de range
         }  // fim do while
      }  // fim do método de remoção utilizando busca binária()
 //--------------------------------------------------------------
//Método de visualização!!! ....
//--------------------------------------------------------------
   public void display()  
      {
      for(int j=0; j<nElems; j++)      
         System.out.print(a[j] + " "); 
      System.out.println("");
      }
   //-----------------------------------------------------------
   }  // fim da classe VetorOrdenado
////////////////////////////////////////////////////////////////
 //--------------------------------------------------------------
//Começamos aqui a classe AppOrdenada! Aquela que usará nossa nova Estrutura de Dados
//--------------------------------------------------------------
class AppOrdenada
   {
   public static void main(String[] args)
      {
      int maxSize = 100;             // coloca em uma constante o tamanho do vetor
      VetorOrdenado arr;                  // criar referência para a estrutura de dados
      arr = new VetorOrdenado(maxSize);   // instancia a estrutura de dados

      arr.insert("Lucas");                // insere 10 itens
      arr.insert("Vanessa");
      arr.insert("Dionizio");
      arr.insert("Alexandre");
      arr.insert("Luiz");
      arr.insert("Mel");
      arr.insert("Vitor");
      arr.insert("Adilson");
      arr.insert("ADS");
      arr.insert("Tiao Carrero");

      String searchKey = "A";            // buscar pelos nomes que começam com a letra L no vetor
      if( arr.find(searchKey) == arr.size() )
         System.out.println("Não há no vetor nome que começa com a letra " + searchKey);
     
      arr.display();                 // mostra os itens da estrutura

      if( arr.delete("ADS") == arr.size() )  // deleta 3 itens
         System.out.println("Não há esse nome no vetor.");
      
      if( arr.delete("Lucas") == arr.size() )
      System.out.println("Não há esse nome no vetor.");
      
       if( arr.delete("Luiz") == arr.size() )
      System.out.println("Não há esse nome no vetor.");
      

       arr.display(); // mostra os itens da estrutura de novo
                       
      }  // finaliza o método main()
   }  // finaliza a classe AppOrde