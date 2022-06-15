package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
  public static void main(String[] args) {
    BinaryOperator<Double> calculo = (x, y) -> {
      return  x + y;
    };

    /*
    * De tipo Wrapper pra primitivo correspondente o Java resolve.
    *
    * De primitivo int para Double ou qualquer outro que não seja
    * o correspondente, temos que passar valores literais do mesmo tipo.
    * Ou usar casting.
    * */

    System.out.println(calculo.apply(2.0, 3.0));

    calculo = (x,y) -> x * y;
    System.out.println(calculo.apply(2.0, (double) 3));


    BinaryOperator<Integer> calc2 = (x, y) -> { return x + y; };
    System.out.println(calc2.apply(2, 5));

    calc2 = (x, y) -> x * y;
    System.out.println(calc2.apply(2, 5));

  }
}
