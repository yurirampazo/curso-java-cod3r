package streams.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
  public static void main(String[] args) {

    List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    /*
    * 1. Número para string binária... 6 =>  "110"
    * 2. Reverter a string... "110" => "011"
    * 3. Converter de volta para inteiro... "011" => 3
    * */

//    Function<Integer, String> stringBinaria = x -> Integer.toBinaryString(x);
    UnaryOperator<String> reverteString = s -> new StringBuilder(s).reverse().toString();
//    UnaryOperator<String> reverteString = x -> {
//      String novaString = "";
//      for (int i = 0; i < x.length(); i++) {
//        novaString = x.charAt(i) + novaString;
//      }
//      return novaString;
//    };
    Function<String, Integer> stringPraInteiro = x ->  Integer.parseInt(x, 2);

//    Teste
//    System.out.println(stringBinaria.apply(9));
//    System.out.println(stringBinaria.andThen(reverteString).apply(9));
//    System.out.println(stringBinaria.andThen(reverteString).andThen(stringPraInteiro).apply(9));

    nums.stream()
          .map(Integer::toBinaryString)
          .map(reverteString)
          .map(stringPraInteiro)
          .forEach(System.out::println);
  }
}
