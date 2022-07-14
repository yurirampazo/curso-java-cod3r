package comparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TesteComparatorComparable {
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

    contas.forEach(System.out::println);

    System.out.println("\nComparator Número da Conta: ");
    NumeroDaContaComparator comparator = new NumeroDaContaComparator();
    contas.sort(comparator);
    contas.forEach(System.out::println);

    System.out.println("\nComparator Titular: ");
    TitularDaContaComparator comparatorTitular = new TitularDaContaComparator();
    contas.sort(comparatorTitular);
    contas.forEach(System.out::println);

    System.out.println("\nComparação usando classe Collections por número da conta: ");
    Collections.sort(contas, new NumeroDaContaComparator());
    contas.forEach(System.out::println);

    System.out.println("\nComparação usando classe Collections por número da conta reverse: ");
    Collections.reverse(contas);
    contas.forEach(System.out::println);

    System.out.println("\nComparação usando classe Collections com Comparable saldo asc: ");  //Usando a ordem natural
    Collections.sort(contas);
    contas.forEach(System.out::println);

    System.out.println("\nComparação usando classe Collections com Comparable saldo desc: ");  //Usando a ordem natural
    Collections.reverse(contas);
    contas.forEach(System.out::println);


  }
}

class NumeroDaContaComparator implements Comparator<Conta> {

  @Override
  public int compare(Conta o1, Conta o2) {
//    return o1.getNumero() - o2.getNumero();
    return Integer.compare(o1.getNumero(), o2.getNumero());
  }
}

class TitularDaContaComparator implements Comparator<Conta> {

  @Override
  public int compare(Conta o1, Conta o2) {
    return o1.getTitular().compareTo(o2.getTitular());
  }
}
