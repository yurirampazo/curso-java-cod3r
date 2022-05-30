package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
  public static void main(String[] args) {
    //Sem parametrizar o tipo do conjunto
    //Liberdade "boa" pois pode-se criar um conjunto heterogênio
    HashSet conjunto = new HashSet();

//    Collections nao suportam tipos primitivos
//    Logo o java trata eles para seus respectivos Wrappers

    conjunto.add(1.2);    // double -> Double
    conjunto.add(true);   //boolean -> Boolean
    conjunto.add("Teste");
    conjunto.add(1);    //   int -> Integer
    conjunto.add('x');  // char -> Character

    System.out.println("Tamanho do conjunto é: " + conjunto.size());

    System.out.println(conjunto.contains("teste"));
    conjunto.add("teste");
    System.out.println(conjunto.contains("teste"));
    System.out.println(conjunto.size());

    System.out.println(conjunto.remove("Yuri"));
    System.out.println(conjunto.remove("Teste"));
    System.out.println(conjunto.size());


    Set nums = new HashSet();
    nums.add(1);
    nums.add(2);
    nums.add(3);

    System.out.println(nums);
    System.out.println(conjunto);


    //Nao mantem a ordem de inclusao e nem uma determinada ordem
    //Adicao de dois conjuntos
//    conjunto.addAll(nums);
//    System.out.println(conjunto);


    //Interseccao de dois conjuntos
    conjunto.retainAll(nums);
    System.out.println(conjunto);

    conjunto.clear();
    System.out.println(conjunto);
  }
}
