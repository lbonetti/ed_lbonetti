package Desafio2;
// classDataArray.java
// data items as class objects
// to run this program: C>java ClassDataApp
////////////////////////////////////////////////////////////////
class Pessoa
   { 
   private String nome;
   private String profissao;
   private int idade;
//--------------------------------------------------------------
   public Pessoa(String last, String first, int a)
      {                               // constutor da classe pessoa
      nome = last;
      profissao = first;
      idade = a;
      }
//--------------------------------------------------------------
   public void displayPessoa()
      {
      System.out.print("   Nome: " + nome);
      System.out.print(", Profissao: " + profissao);
      System.out.println(", Idade: " + idade);
      }
//--------------------------------------------------------------
   public String getNome()           // método que retorna o sobrenome
      { return nome; }
   }  // end class Person
////////////////////////////////////////////////////////////////
class EstruturaDadosOb
   {
   private Pessoa[] a;               // criando um atributo privado do tipo Pessoa
   private int nElems;               /// criando um atributo privato para controlar a quantidade de elementos

   public EstruturaDadosOb(int max)    // construtor da classe EstruturaDadosOb
      {
      a = new Pessoa[max];               // instanciando o objetvo do tipo Pessoa
      nElems = 0;                        // atribuindo 0 a quantidade de elementos
      }
//--------------------------------------------------------------
      public boolean find(String searchName)
      {                                 // método para encontrar uma pessoa no array utilizando busca binária
      int lowerBound = 0;               //limite inferior
      int upperBound = nElems-1;        //limite superior (quantidade de elementos no vetor -1)
      int curIn;                        //posição atual de busca

      while(true)
         {
         curIn = (lowerBound + upperBound ) / 2; //define o "universo" da busca
         if(a[curIn].getNome().equals(searchName)){ //compara se o que tem na posição atual do vetor com o parâmetro
            a[curIn].displayPessoa(); //caso encontre, chama o método display da classe Pessoa
            return true;
         }  
         else if(lowerBound > upperBound)
            return false;             // não pude encontra-lo
         else                          // divide o range
            {
            if(a[curIn].getNome().compareTo(searchName) < 0)
               lowerBound = curIn + 1; // esta na metade de cima
            else
               upperBound = curIn - 1; // esta na metade de baixo
            }  // fim do else de divisão de range
         }  // fim do while
      }  // fim do método de pesquisa binária()
//--------------------------------------------------------------                                    // put person into array
      public void insert(String nome, String profissao, int idade)    // método de inserção ordenada!
      {
      int j;
      for(j=0; j<nElems; j++)        // localiza onde esse elemento se encaixa
         if(a[j].getNome().compareTo(nome) > 0)    // OBS: Usando aqui busca linear!!! Poderia ser binária!
            break;
      for(int k=nElems; k>j; k--)    // move os elementos maiores uma posição p/ frente
         a[k] = a[k-1];
      a[j] = new Pessoa(nome, profissao, idade);      // insere o elemento na posição necessária
      nElems++;                      // incrementa a variavel de controle de tamanho
      }  // finaliza o método de inserção
//--------------------------------------------------------------
      public int delete(String searchName)
      {
      int lowerBound = 0;
      int upperBound = nElems-1;
      int curIn;

      while(true)
         {
         curIn = (lowerBound + upperBound) / 2;
         if(a[curIn].getNome().equals(searchName)){
             for(int k=curIn; k<nElems; k++) // move os elementos uma posição pra tras
                 a[k] = a[k+1];
             nElems--; // decrementa o tamanho
             return curIn;   
         }
         else if(lowerBound > upperBound)
            return nElems;             // não pude encontra-lo
         else                          // divide o range
            {
            if(a[curIn].getNome().compareTo(searchName) < 0)
               lowerBound = curIn + 1; // esta na metade de cima
            else
               upperBound = curIn - 1; // esta na metade de baixo
            }  // fim do else de divisão de range
         }  // fim do while
      }  // fim do método de remoção utilizando busca binária()
//--------------------------------------------------------------
   public void displayA()            // comentario aqui
      {
      for(int j=0; j<nElems; j++)       // comentario aqui
         a[j].displayPessoa();// comentario aqui
      }
//--------------------------------------------------------------
   }  // end class ClassDataArray
////////////////////////////////////////////////////////////////
class ClassDataApp
   {
   public static void main(String[] args)
      {
      int maxSize = 100;             // comentario aqui
      EstruturaDadosOb arr;            // comentario aqui
      arr = new EstruturaDadosOb(maxSize);  // comentario aqui
                                     // comentario aqui
      arr.insert("Evans", "Professora", 24);
      arr.insert("Smith", "Médica", 37);
      arr.insert("Yee", "Programador", 43);
      arr.insert("Adams", "DBA", 63);
      arr.insert("Hashimoto", "Matemático", 21);
      arr.insert("Stimson", "Astronomo", 29);
      arr.insert("Velasquez", "Pescador", 72);
      arr.insert("Lamarque", "Engenheiro", 54);
      arr.insert("Vang", "Estudante", 22);
      arr.insert("Creswell", "Politica", 18);

      arr.displayA();                // exibe o conteúdo do vetor

      String searchName = "Stimson";  // busca de pessoas
      if(arr.find(searchName) == false)
         System.out.print("Pessoa não encontrada.");


      System.out.println("Deletenado Smith, Yee, and Creswell"); // deletando pessoas
      arr.delete("Smith");        
      arr.delete("Yee");
      arr.delete("Creswell");

      arr.displayA();                // comentario aqui
      }  // end main()
   }  // end class ClassDataApp
