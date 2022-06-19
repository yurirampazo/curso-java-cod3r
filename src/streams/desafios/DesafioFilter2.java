package streams.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

public class DesafioFilter2 {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);

    /*
    * 1. Cenário de Loja onde temos produtos que estarão ou não com Desconto.
    * 2. Alguns produtos devem ter frete grátis.
    * 3. Outros devem ter mais ou menos que 30% de desconto.
    * */

    Produto p1 = new Produto("Shampoo", 14.99, 0.1, 0.0);
    Produto p2 = new Produto("Desodorante", 15.99, 0.15, 0.0);
    Produto p3 = new Produto("Whey Protein", 180.99, 0.30, 30.0);
    Produto p4 = new Produto("Monitor Ultra Wide", 2500.99, 0.40, 100.0);

    List<Produto> produtos = Arrays.asList(p1, p2, p3, p4);

    Function<Produto, String> precoReal = x -> {
      x.preco = (1 - x.desconto) * x. preco;
      return "O preço do produto: " + x.nome + " é: R$ "
            + String.format("%.2f",x.preco).replace(".", ",")
               + ".";
    };

    produtos.stream()
          .filter(x -> x.desconto >= 0.30)
          .filter(x -> x.frete > 0.0)
          .map(precoReal)
          .forEach(System.out::println);
  }
}
