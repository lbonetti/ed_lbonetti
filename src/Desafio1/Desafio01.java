/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Desafio1;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Desafio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //instancia da classe Scanner
        Scanner scan = new Scanner(System.in);
        
        //criacao do vetor que recebera os nomes
        String[] vetor = new String[5];
        
        //repeticao para preencher o array com nomes
        for (int i=0; i<5; i++){
        System.out.println("Informe o nome da pessoa " + i);    
        vetor[i]=scan.nextLine();
        }
        
        //verifica a existencia de nome com a letra informada
        System.out.println("Informe uma letra para fazer a verificacao: ");
        char letra = scan.next().charAt(0);
        boolean resultado=false;
     
        //repeticao para verificação
        for (int i=0; i<5; i++){
            char res = vetor[i].charAt(0);
            if (res == letra){
                resultado=true;
                System.out.println(vetor[i]);
            }
        }
        
        //exibe uma mensagem caso não haja nenhuma pessoa com essa inicial
        if (resultado==false){
            System.out.println("Não há nenhum nome com essa inicial.");
        }
        
    }
    
}
