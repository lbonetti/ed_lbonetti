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

      arr.displayA();                // exibe o conteúdo do vetor

      String searchName = "Adams";  // busca de jogadores por nome
      System.out.println("Os nomes encontrados foram:");
      arr.findName(searchName);
      
      int searchAge = 21;  // busca de jogadores por idade
      if (arr.findAge(searchAge)==false)
              System.out.println("Não há jogadores com essa idade.");


      System.out.println("Deletenado os jogadores com o idade 21"); // deletando jogadores
      arr.delete(searchAge); //chama o método delete

      arr.displayA();                // exibe o conteúdo do vetor
      }  // end main()
    
}
