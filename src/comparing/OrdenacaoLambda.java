package comparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoLambda {
  public static void main(String[] args) {
    Conta c1 = new Conta("Yuri", 33, 5000.0);
    c1.depositar(333.0);

    Conta c2 = new Conta("Jana", 44, 6000.0);
    c1.depositar(444.0);

    Conta c3 = new Conta("Gabi", 11, 5500.0);
    c1.depositar(111.0);

    Conta c4 = new Conta("Bia", 22, 6200.0);
    c1.depositar(222.0);

    List<Conta> contas = new ArrayList<>();
    contas.add(c1);
    contas.add(c2);
    contas.add(c3);
    contas.add(c4);


    System.out.println("\nComparator Número da Conta: ");
    contas.sort(new Comparator<Conta>() {
        @Override
        public int compare(Conta o1, Conta o2) {
          return Integer.compare(o1.getNumero(), o2.getNumero());
        }
      }
    );
    contas.sort((x, y) -> x.getNumero().compareTo(y.getNumero()));  //Inline
    contas.sort(Comparator.comparing(Conta::getNumero));  //Method Reference
    contas.forEach(System.out::println);

    System.out.println("\nComparator Titular: ");
    contas.sort((x, y) -> {
      return x.getTitular().compareTo(y.getTitular());
    });
    contas.sort((o1, o2) -> o1.getTitular().compareTo(o2.getTitular()));  //Inline
    contas.sort(Comparator.comparing(Conta::getTitular));  //Method Reference
    contas.forEach(System.out::println);


    System.out.println("\nComparator Saldo: ");
    contas.sort((x, y) -> {
      return x.getSaldo().compareTo(y.getSaldo());
    });
    contas.sort((x, y) -> x.getSaldo().compareTo(y.getSaldo()));  //Inline
    contas.sort(Comparator.comparing(Conta::getSaldo));  //Method Reference
    contas.forEach(System.out::println);

    System.out.println("\nComparable Saldo: ");
    contas.sort((x, y) -> x.compareTo(y));  //Inline
    contas.sort(Conta::compareTo);   //Method Reference
    Collections.sort(contas);    //Comparable
  }
}
