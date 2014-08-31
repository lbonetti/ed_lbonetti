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
//Método de remoção!!! ....
//--------------------------------------------------------------  
   public int delete(String value) //método delete utilizando busca binária
      {
      int lowerBound = 0;
      int upperBound = nElems-1;
      int curIn;

      while(true)
         {
         curIn = (lowerBound + upperBound) / 2;
         if(a[curIn].equals(value)){
             for (int i =curIn; a[i].equals(value);i++){ //move o elemento encontrado e seus possíveis sucessores
                for(int k=i; k<nElems; k++) // move os elementos uma posição pra tras 
                a[k] = a[k+1];
                nElems--;}
             for (int i =curIn-1; a[i].equals(value);i--){ //move os possíveis antecessores do número encontrado
                for(int k=i; k<nElems; k++) // move os elementos uma posição pra tras 
                a[k] = a[k+1];
                nElems--;}
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

      arr.insert(77);                // insere 10 itens
      arr.insert(99);
      arr.insert(44);
      arr.insert(55);
      arr.insert(22);
      arr.insert(88);
      arr.insert(11);
      arr.insert(00);
      arr.insert(66);
      arr.insert(33);

      String searchKey = "t";            // buscar pela letra t no vetor
      if( arr.find(searchKey) != arr.size() )
         System.out.println("Encontrei o item " + searchKey);
      else
         System.out.println("Não encontrei o item " + searchKey);

      arr.display();                 // mostra o item

      arr.delete(00);                // deleta 3 itens
      arr.delete(55);
      arr.delete(99);

      arr.display();                 // mostra os itens da estrutura de novo
      }  // finaliza o método main()
   }  // finaliza a classe AppOrde