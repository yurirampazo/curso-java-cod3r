package lambdas;

import java.util.function.Function;

public class Funcao {
  public static void main(String[] args) {

    Function<Integer,String> parOuImpar =
          p -> (p % 2 == 0)? "Par" : "Impar";

    System.out.println(parOuImpar.apply(2));
    System.out.println(parOuImpar.apply(3));

    Function<String, String> resultado =
          v ->  "Resultado: " + v;

    System.out.println(parOuImpar.andThen(resultado).apply(32));

    Function<String, String> empolgado =
          v ->  v + "!!!";

    Function<String, String> what =
          v ->  v + "?$#&@";

    System.out.println(parOuImpar.andThen(resultado).andThen(empolgado).andThen(what).apply(33));
    
  }
}
