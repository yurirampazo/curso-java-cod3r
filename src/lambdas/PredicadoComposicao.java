package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {
  public static void main(String[] args) {

    Predicate<Integer> isEven = x -> x % 2 == 0;
    Predicate<Integer> has3Digits = x -> x >= 100 && x <= 999;

    System.out.println(isEven.test(2));
    System.out.println(has3Digits.test(123));
    System.out.println(isEven.and(has3Digits).test(133));
    System.out.println(isEven.and(has3Digits).negate().test(133));
    System.out.println(isEven.and(has3Digits).test(132));
    System.out.println(isEven.or(has3Digits).test(12));

  }
}
