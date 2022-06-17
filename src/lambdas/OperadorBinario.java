package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
  public static void main(String[] args) {
    BinaryOperator<Double> mediaNotas = (x,y) -> (x + y)/2;

    System.out.printf("%.2f\n", mediaNotas.apply(8.9, 9.8));

    BiFunction<Double, Double, String> resultado = (x,y) -> ((x + y) / 2) >= 6 ? "Aprovado" : "Reprovado";
//    BiFunction<Double, Double, String> resultadoExtenso = (x,y) ->
//    {
//      String notaFinal = ((x + y) / 2) >= 6 ? "Aprovado" : "Reprovado";
//      return notaFinal;
//    };
    System.out.println(resultado.apply(6.5, 4.4));
    System.out.println(resultado.apply(9.95, 10.0));

    Function<Double, String> media = m -> m >= 6 ? "Aprovado" : "Reprovado";

    System.out.println(mediaNotas.andThen(media).apply(5.5,7.4));
  }
}
