package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class Reduce {
  public static void main(String[] args) {

    List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    BinaryOperator<Integer> soma = (ac, n) -> ac +n;

    Integer total = nums.stream().reduce(soma).get();
//    Optional<Integer> total1 = nums.stream().reduce((acumulador, n) -> acumulador + n);
    Optional<Integer> total1 = nums.stream().reduce(Integer::sum);
    Integer total2 = nums.parallelStream().reduce(100, soma);

    System.out.println(total);
    System.out.println(total1);
    System.out.println(total2);

//    Resultado foi um Optional<Integer>
    nums.stream()
          .filter(n -> n > 10)
          .reduce(soma)
          .ifPresent(System.out::println);
  }
}
