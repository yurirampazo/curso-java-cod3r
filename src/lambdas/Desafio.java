package lambdas;

import java.util.Locale;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);

    Produto p1 = new Produto("IPad", 899.99, 0.15);
     /*
     * 1. A partir do produto calcular o preco real (com desconto)
     * 2. Imposto Municipal: >= 2500 (8,5%) / < 2500 (Insento)
     * 3. Frete: >= 3000 (Grátis) / < 3000 (100)
     * 4. Arredondar: Deixar duas casas decimais
     * 5. Formatar: R$ 1234,56
     * */

    Function<Produto, Double> precoReal = x -> x.preco  * (1 - x.desconto);
    UnaryOperator<Double> imposto = x ->  x >= 2500 ? x * 1.085 : x;
    UnaryOperator<Double> frete = x -> x >= 3000 ? x : x + 100.0;
    UnaryOperator<Double> arredondar = x ->  Double.valueOf(String.format("%.2f", x));
    Function<Double, String> formatar = x -> ("R$ " + x).replace(".", ",")  ;

    String precoFinal = precoReal.andThen(imposto).andThen(frete).andThen(arredondar).andThen(formatar).apply(p1);
    System.out.println("O preço final é " + precoFinal);

  }
}
