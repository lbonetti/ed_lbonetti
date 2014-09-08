/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package er1;

/**
 *
 * @author Aluno
 */
public class Usuaria {
    public static void main(String[] args)
      {
      int maxSize = 100;             // comentario aqui
      Estrutura arr;            // comentario aqui
      arr = new Estrutura(maxSize);  // comentario aqui
                                     // comentario aqui
      arr.insert("Evans", 1.65, 21);
      arr.insert("Smith", 1.91, 37);
      arr.insert("Yee", 1.87, 43);
      arr.insert("Adams", 1.74, 63);
      arr.insert("Hashimoto", 1.48, 21);
      arr.insert("Stimson", 1.93, 29);
      arr.insert("Velasquez", 1.70, 72);
      arr.insert("Adams", 1.68, 54);
      arr.insert("Vang", 1.65, 22);
      arr.insert("Creswell", 1.64, 18);
      
      System.out.println("Exibindo todo o conteúdo do vetor"); // exibe o conteúdo do vetor
      arr.displayA(); //metodo para exibir          

      System.out.println("\nBuscando jogadores pelo nome. Ex: Adams"); // busca de jogadores por nome
      String searchName = "Adams";  
      if(arr.findName(searchName)==false) //metodo de busca pelo nome
      System.out.println("Não há jogadores com esse nome.");
      
      System.out.println("\nBuscando jogadores pelo nome. Ex: Lucas"); // busca de jogadores por nome
      searchName = "Lucas";  //esse nome não existe no vetor
      if(arr.findName(searchName)==false) //metodo de busca pelo nome
      System.out.println("Não há jogadores com esse nome.");

      
      System.out.println("\nBuscando jogadores pela idade. Ex: 21 anos"); // busca de jogadores por idade
      int searchAge = 21;  
      if (arr.findAge(searchAge)==false) //metodo de busca pela idade
      System.out.println("Não há jogadores com essa idade.");

      System.out.println("\nBuscando jogadores pela idade. Ex: 26 anos"); // busca de jogadores por idade
      searchAge = 26;  //essa idade não existe no vetor
      if (arr.findAge(searchAge)==false) //metodo de busca pela idade
      System.out.println("Não há jogadores com essa idade.");

        
      System.out.println("\nDeletando um jogadores pela idade. Ex: 43 anos"); // busca de jogadores por idade  
      searchAge = 43;
      if (arr.delete(searchAge)==false) //metodo de busca pela idade
      System.out.println("Não há jogadores com essa idade.");

      System.out.println("\nExibindo todo o conteúdo do vetor"); // exibe o conteúdo do vetor
      arr.displayA(); //metodo para exibir 
      }  // end main()
    
}
