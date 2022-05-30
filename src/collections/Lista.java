package collections;

import java.util.ArrayList;
import java.util.List;

public class Lista {
  public static void main(String[] args) {
    List<Usuario> lista = new ArrayList<>();
    Usuario u1 = new Usuario("Ana");

    //Lista respeita a ordem de inserçao, os items são indexados

    lista.add(u1);
    lista.add(new Usuario("Carlos"));
    lista.add(new Usuario("Lia"));
    lista.add(new Usuario("Bia"));
    lista.add(new Usuario("Manu"));
    lista.add(new Usuario("Manu"));   //Lista aceita repetição

//    System.out.println(lista.get(3).nome);   //Sem implementar o toString para imprimir o nome
    System.out.println(lista.get(3));   //Com o toString implementado, é possível acessar pelo indice
                                        // sem passar um parametro
    System.out.println(">>>>" + lista.remove(1));
    lista.remove(new Usuario("Manu"));  // Sem equals e hashCode não consegue excluir

    for (Usuario u : lista) {
      System.out.println(u);
    }

    System.out.println("Tem? " + lista.contains(new Usuario("Lia")));   //Com equals e Hashcode é true
    System.out.println("Tem tambem? " + lista.contains(u1));

    System.out.println(lista);

  }
}
