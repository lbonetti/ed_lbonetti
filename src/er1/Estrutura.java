package er1;
// classDataArray.java
// data items as class objects


// to run this program: C>java ClassDataApp
////////////////////////////////////////////////////////////////

public class Estrutura
   {
   private Jogador[] a;               // criando um atributo privado do tipo Jogador
   private int nElems;               /// criando um atributo privato para controlar a quantidade de elementos

   public Estrutura(int max)    // construtor da classe Estrutura
      {
      a = new Jogador[max];               // instanciando o objeto do tipo Jogador
      nElems = 0;                        // atribuindo 0 a quantidade de elementos
      }
//--------------------------------------------------------------
      public boolean findAge(int searchAge)
      {                                 // método para encontrar um jogador no array pela idade utilizando busca binária
      int lowerBound = 0;               //limite inferior
      int upperBound = nElems-1;        //limite superior (quantidade de elementos no vetor -1)
      int curIn;                        //posição atual de busca

      while(true)
         {
         curIn = (lowerBound + upperBound ) / 2; //define o "universo" da busca
         if(a[curIn].getAge()==searchAge){ //verifica se o nome nesta posição começa com a letra informada pelo usuário
             for (int i =curIn; a[i].getAge()==searchAge;i++){ //verifica a posição atual e as sucessoras enquanto começar com a mesma letra
                 a[i].displayJogador(); //chama o método displayJogador para exibir as informações da pessoa encontrada
                 if (i+1==nElems){ //verifica se está na útlima posição do array
                     break;} //caso esteja, sai da repetição, para evitar erro de Array out of Bounds (fora de alcançe)
                 }
             if (curIn!=0){ //verifica se todas as posições já foram varridas, pois se curIn for 0 ao decrementar 1 neste for vai dar erro
                for (int i =curIn-1; a[i].getAge()==searchAge;i--){ //verifica a posição anterior e as antecessoras enquanto começar com a mesma letra
                    a[i].displayJogador(); //chama o método displayPessoa para exibir as informações da pessoa encontrada
                    if (i==0){ //verifica se está na primeira posição do array 
                        break;}//caso esteja, sai da repetição, para evitar erro de Array out of Bounds (fora de alcançe)
                }
            }
            return true;
         }  
         else if(lowerBound > upperBound)
            return false;             // não pude encontra-lo
         else                          // divide o range
            {
            if(a[curIn].getAge() < searchAge)
               lowerBound = curIn + 1; // esta na metade de cima
            else
               upperBound = curIn - 1; // esta na metade de baixo
            }  // fim do else de divisão de range
         }  // fim do while
      }  // fim do método de pesquisa binária()
//-------------------------------------------------------------- 
//--------------------------------------------------------------
      public boolean findName(String searchName) // método para encontrar um jogador no array pelo nome utilizando busca linear
      {
          boolean encontrou=false;
          for(int i=0; i<nElems;i++){
            if(a[i].getName().equals(searchName)){ //verifica se o nome nesta posição é igual ao parâmetro passado
                    a[i].displayJogador(); //chama o método displayJogador para exibir as informações da pessoa encontrada
                    encontrou=true;
            }
          }
          return encontrou;
      }
      // fim do método de pesquisa linear ()
//--------------------------------------------------------------
      public void insert(String nome, double altura, int idade)    // método de inserção ordenada!
      {
      int j;
      for(j=0; j<nElems; j++)        // localiza onde esse elemento se encaixa
         if(a[j].getAge()> idade)    // OBS: Usando aqui busca linear!!! Poderia ser binária!
            break;
      for(int k=nElems; k>j; k--)    // move os elementos maiores uma posição p/ frente
         a[k] = a[k-1];
      a[j] = new Jogador(nome, altura, idade);      // insere o elemento na posição necessária
      nElems++;                      // incrementa a variavel de controle de tamanho
      }  // finaliza o método de inserção
//--------------------------------------------------------------
      public boolean delete(int searchAge) //esse metodo de exclusão não era necessário, porém implementei. 
      {                                    //contem uma falha, por exempelo, se houver 2 ou mais jogadores com a mesma idade,
      int lowerBound = 0;                  //ele deleta apenas o primeiro que for encontrado
      int upperBound = nElems-1;
      int curIn;

      while(true)
         {
         curIn = (lowerBound + upperBound) / 2;
         if(a[curIn].getAge()==searchAge){
             if (curIn==nElems-1){ //verifica se esse elemento não é o último do array
                 nElems--; //caso seja, apenas descondiera o último elemento, não traz os mais altos para "frente"
             }
             else{
             for(int k=curIn; k<nElems; k++) // move os elementos uma posição pra tras
                 a[k] = a[k+1];
             nElems--;  // decrementa o tamanho
             }
             return true;   
         }
         else if(lowerBound > upperBound)
            return false;             // não pude encontra-lo
         else                          // divide o range
            {
            if(a[curIn].getAge() < searchAge)
               lowerBound = curIn + 1; // esta na metade de cima
            else
               upperBound = curIn - 1; // esta na metade de baixo
            }  // fim do else de divisão de range
         }  // fim do while
      }  // fim do método de remoção utilizando busca binária()
//--------------------------------------------------------------
   public void displayA()            // método que exibe todo o conteúdo do array
      {
      for(int j=0; j<nElems; j++)      
         a[j].displayJogador();
      }
//--------------------------------------------------------------
   }  // end class Estrutura
////////////////////////////////////////////////////////////////
