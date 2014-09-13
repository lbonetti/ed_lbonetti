/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exercicio3;

/**
 *
 * @author Aluno
 */
public class EstruturaDados {
    
    private Animal[] a;                 // criamos a referência para um array Long
    private int nElems;               // controla a qty de itens no vetor
//--------------------------------------------------------------
    public EstruturaDados(int max){          // Método construtor
        a = new Animal[max];                    // Instancia um novo array
        nElems = 0;                        // coloca no inicio a variavel nElems c/ zero elemento
    }
//---------------------------------------------------------------    

//--------------------------------------------------------------
//Método que faz a inserção no vetor Animal....
//--------------------------------------------------------------
    public void insert(String n, String c, double t){
        a[nElemens] = new Animal(n, c, t);}
//---------------------------------------------------------------    
    
//--------------------------------------------------------------
//Método que retorna quantidade de itens do vetor ....
//--------------------------------------------------------------
    public int size(){
        return nElems; }
//---------------------------------------------------------------    
    
}
