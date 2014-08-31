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
         if(a[curIn].charAt(0)==searchKey.charAt(0)){
             for (int i =curIn; a[i].charAt(0)==searchKey.charAt(0);i++){
                 System.out.println("O nome " + a[i] + " começa com " + searchKey.charAt(0));}
             for (int i =curIn-1; a[i].charAt(0)==searchKey.charAt(0);i--){
                 System.out.println("O nome " + a[i] + " começa com " + searchKey.charAt(0));}
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
             for(int k=curIn; k<nElems; k++) // move os elementos uma posição pra tras
                 a[k] = a[k+1];
             nElems--; // decrementa o tamanho
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
      arr.insert("IFSP");
      arr.insert("ADS");
      arr.insert("Tiao Carrero");

      String searchKey = "L";            // buscar pelos nomes que começam com a letra L no vetor
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