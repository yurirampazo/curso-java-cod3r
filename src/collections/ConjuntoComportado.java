package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
  public static void main(String[] args) {
//    Set<String> listaAprovados = new HashSet<>();
//    SortedSet<String> listaAprovados = new TreeSet<>();   //  TreeSet garante ordem de inserção
    Set<String> listaAprovados = new TreeSet<>();   //  TreeSet garante ordem de inserção
    //Conjuntos Set NAO aceitam repeticao

    listaAprovados.add("Ana");
    listaAprovados.add("Carlos");
    listaAprovados.add("Luca");
    listaAprovados.add("Pedro");

    //Esse HashSet não respeita ordenação

    for (String candidato : listaAprovados) {
      System.out.println(candidato);
    }


    Set<Integer> nums = new HashSet<>();
    nums.add(1);
    nums.add(2);
    nums.add(120);
    nums.add(6);

    for (int a : nums) {
      System.out.println(a);
    }

  }
}
