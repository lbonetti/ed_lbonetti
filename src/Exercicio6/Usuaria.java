/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exercicio6;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Usuaria {
    public static void main(String[] args){
        Scanner scanInt = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);
        FilaPrioridade fila = new FilaPrioridade(5);
        boolean status = true;
        int op;
        
        while (status){
            System.out.println("Olá querido usuário!");
            System.out.println("Bem-vindo ao menu do programa.");
            System.out.println("Informe a opção desejada: ");
            System.out.println("1. Incluir paciente");
            System.out.println("2. Chamar paciente");
            System.out.println("3. Sair");
            op = scanInt.nextInt();
            
            
            switch (op){
                case 1:
                    if (!fila.isFull()){
                        System.out.println("Informe o nome do paciente: ");
                        String nome = scanStr.nextLine();
                        System.out.println("Informe a prioridade: ");
                        int prioridade = scanInt.nextInt();
                        fila.insert(nome, prioridade);
                        System.out.println("Inserido com sucesso!");
                    }
                    else{
                        System.out.println("\n******************");
                        System.out.println("A fila está cheia.");
                        System.out.println("******************");
                    }
                break;
                    
                case 2:
                    if (!fila.isEmpty()){
                        System.out.println("\n******************");
                        System.out.println(fila.remove());
                        System.out.println("******************");
                    }
                    else{
                        System.out.println("\n********************");
                        System.out.println("A fila está vazia.");
                        System.out.println("********************");
                    }
                break;
                    
                case 3:
                    status=false;
                break;            
            }
            
        }
    }
    
    
}
