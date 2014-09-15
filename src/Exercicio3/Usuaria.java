/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exercicio3;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Usuaria {
    public static void main(String[] args){
        int maxSize = 100;            // coloca em uma constante o tamanho do vetor
        EstruturaDados arr = new EstruturaDados(maxSize); // instancia a estrutura de dados
        Scanner scan = new Scanner (System.in); //Instancio o objeto scan do tipo Scanner
        System.out.println("Bem Vindo ao Programa de controle de animais!!!");
        
        arr.insert("Batatinha", "Branco", 1.3); //inserindo objetos no vetor
        arr.insert("Arack", "Preta", 0.6);
        arr.insert("Mel", "Amarelo", 2);
        arr.insert("Thor", "Marrom", 1.5);
        arr.insert("Princesa", "Branco", 0.75);
        
        System.out.println("\nEstes objetos foram inseridos no vetor de forma desordenada, como podemos ver a seguir: ");
        arr.display(); //exibe os elementos no vetor
        
        System.out.println("\nVamos fazer a ordenacao por nomes. O método utilizado sera o BuubleSort");
        arr.bubbleSort(); //ordena por nomes utilizando bubbleSort
        arr.display(); //exibe os elementos no vetor
        System.out.println("Informe o nome para busca no vetor: ");
        if(arr.findName(scan.nextLine())==arr.size()){
            System.out.println("Não foi encontrado nenhum animal com este nome");
        }
        
        System.out.println("\nMuito bom. Agora, vamos ordenar pela cor, utilizando o método Select Sort: ");
        arr.selectionSort(); //ordena por cor utilizando selectsort
        arr.display();//exibe os elementos no vetor
        System.out.println("Informe a cor para busca no vetor: ");
        if(arr.findColor(scan.nextLine())==arr.size()){
            System.out.println("Não foi encontrado nenhum animal com esta cor");
        }
        
        System.out.println("\nExcelente. E para finalizar, vamos ordenar pelo tamanho, utilizando o método Insert Sort");
        arr.insertionSort(); //ordena por tamanho utilizando insertsort
        arr.display();//exibe os elementos no vetor
        System.out.println("Informe a altura para busca no vetor: OBS: Informe casas decimais com virgula ");
        double altura = scan.nextDouble();
        if(arr.findSize(altura)==arr.size()){
            System.out.println("Não foi encontrado nenhum animal com esta altura");
        }
        
    }
    
}
