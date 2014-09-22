/*
José é dono de uma transportadora. Ele é atrapalhado e preguiçoso. Não planeja suas entregas, 
apenas enche seu caminhão com as mercadorias e sai fazer as entregas.
Muitas vezes, por não ter planjeado, tem que descarregar o caminhão todo para poder entregar 
uma mercadoria que estava na frente de outras no baú do caminhão.
Isso aconteçe pois ele fez a entrega de uma mercadoria que foi carregada antes de outras que ainda não foram entregues.
Como consequência, ele perde muito tempo e chega em casa tarde e sua esposa fica furiosa.
Para evitar que isso ocorra, José pediu um sistema que conforme ele carrega seu caminhao, informe no sistema o destino da mercadoria carregada,
e após carregar todas as mercadorias o sistema retorne a ordem que ele deve efetuar suas entregas, de acordo com a ordem das mercadorias no baú.
Por exemplo, a primeira mercadoria a ser carregada deve ser a última a ser entregue, pois está no início no baú do caminhão, e assim por diante.
 */

package Exercicio4;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Usuaria { //A descrição do sistema estão nas linhas de 1 a 10
    public static void main(String[] args)
      {
          Scanner scan = new Scanner (System.in);
          
          System.out.println("A descricao do programa estão nas linhas de 1 a 10 da classe Usuária.");
          System.out.println("Querido José, bem vindo ao programa da sua transportadora.");
          System.out.println("Quantas mercadorias o senhor vai carregar agora?");
          int qntd = scan.nextInt();
          
          Logistica lgt = new Logistica (qntd);
          for (int i = 0; i<qntd;i++){
              System.out.println("Informe o destino da mercadoria " + i+1);
              String str = scan.nextLine();
              lgt.insert(str);
          }
          
          lgt.definirRota();
      }
}