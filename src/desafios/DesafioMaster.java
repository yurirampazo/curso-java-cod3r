package desafios;

import java.util.Scanner;

public class DesafioMaster {
  /*
  * Frase invertida
Fazer um programa que diga se a frase/palavra quando invertida a sequência de reverseStrings
continua exatamente igual. Imprimindo um boolean no console com a resposta, usar os
testes abaixo:
"Ana" -> true"
hannah" -> true
"" -> false
"O lobo ama o bolo" -> true
"A Daniela ama a lei? Nada!" -> true"
Ande logo, ela vale o gol, Edna!" -> true
"o bolo é gostoso" -> false
  * */

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite uma frase ou uma palavra para saber se está invertida: ");
    String palavra = sc.nextLine();


    System.out.println(palavra);
    String stringSemPontuacao = tiraPontuacao(palavra);

    String reverseString = "";

    for (int i = 0; i < stringSemPontuacao.length(); i++) {
      reverseString = stringSemPontuacao.charAt(i) + reverseString;
    }

    System.out.println(reverseString);

    if (stringSemPontuacao.equals(reverseString)) {
      System.out.println(true);
    } else  {
      System.out.println(false);
    }

    sc.close();
  }

  public static String tiraPontuacao(String stringComPontuacao) {
    return stringComPontuacao.replace(",","").replace(".","")
          .replace(" ", "").replace("?", "").replace("!", "")
          .toLowerCase();
  }

}





