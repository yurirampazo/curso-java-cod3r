package comparing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClasseAnonima {
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
    contas.forEach(System.out::println);


    contas.sort(new Comparator<>() {
      @Override
      public int compare(Conta o1, Conta o2) {
        return Integer.compare(o1.getNumero(), o2.getNumero());
      }
    });
    contas.forEach(System.out::println);
  }
}
