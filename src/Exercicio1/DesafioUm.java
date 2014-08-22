/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exercicio1;

/**
 *
 * @author Lucas Bonetti
 */
import java.util.Scanner;

    class EstruturaDados {
        private String[] n;               // cria a referência do vetor
        private int nElems;               //nElems controla quantos elementos o vetor terá ...
        
      public EstruturaDados(int max)      // método construtor
      {
      n = new String[max+1];               // cria o vetor ...
      nElems = 0;                        // inicialmente sem itens ...
      }
      
      public void insert(String nome)    // insere um elemento no vetor
      {
      n[nElems] = nome;             // insere nessa posição ...
      nElems++;                      // incrementa o tamanho
      }
      
      public String delete(String value) //metodo que deleta um nome da string
      {
      int j;
      String resultado = "Não há esse nome no vetor.";
      for(j=0; j<nElems; j++)        // varre o vetor 
         if(value.equals(n[j])){
            resultado = "Nome(s) apagado(s) com sucesso!";
            for(int k=j; k<nElems; k++){ // move os mais altos para "frente"
            n[k] = n[k+1];
            nElems--; // decrementa o contador de elementos          
            }
         }
      return(resultado);
      }  // final do método de remoção
      
      public String findName(String value) //metodo que encontra um nome na string
      {
      int j;
      String resultado = "Os nomes encontrados foram: ";
      for(j=0; j<nElems; j++)        // varre o vetor 
         if(value.equals(n[j]))
            resultado = value + " está no vetor na posição " +j + "\n";
 
      return(resultado);
      }  // final do método de remoção
      
      public String findWithLetter(char searchKey) // metodo buscará o nome que começa com a letra que a classe usuaria pedir ...
      {                              
      int j;
      //cria uma string com os nomes que começarem com a letra informada pelo usuário
      String nomes="Os nomes encontrados foram: ";
      for(j=0; j<nElems; j++){
        // varrerá o vetor buscando ...
         if(n[j].charAt(0) == searchKey) // entrou o item?
            nomes = nomes + "\n" +n[j];    // Armazena na string nomes ...
      }
       return(nomes); //retorna a string com os nomes
      }
}
  
    class Usuaria
      {
        public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        //O usuário informa quantos nomes quer inserir
        System.out.println("Informe quantos nomes voce deseja inserir: ");
        int qntNomes = scan.nextInt();
        
        /*instancia a classe dados criando o vetor com o numero de elementos informado pelo usuário*/
        EstruturaDados dados = new EstruturaDados(qntNomes); 

        //Inserção dos nomes
        int i = 0;
        while(i<qntNomes){
        System.out.println("Informe o nome da pessoa : " +i);
        dados.insert(scan.next());
        i++;
        }
        
        //Busca de nomes pela primeira letra
        System.out.println("Informe uma letra : " );
        String letras = scan.next();
        System.out.println(dados.findWithLetter(letras.charAt(0)));
        
        //Exclusão de nomes
        System.out.println("Informe o nome que deseja deletar : " );
        String nomeExclude = scan.next();
        System.out.println(dados.delete(nomeExclude));
        
        //Busca de nomes completo
        System.out.println("Informe o nome que deseja encontrar : " );
        String nomeFull = scan.next();
        System.out.println(dados.findName(nomeFull));
        }          
}  
    
