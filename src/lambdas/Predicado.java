package lambdas;

import java.util.function.Predicate;

public class Predicado {
  public static void main(String[] args) {

//    Predicate<Produto> isExpensive =  prod -> false;
//    Predicate<Produto> isExpensive =  prod -> prod.preco >= 750.0;
    Predicate<Produto> isExpensive =  prod -> prod.preco * (1 - prod.desconto) >= 750.0;

    Produto produto = new Produto("Notebook", 3892.55, 0.15);
    Produto produto2 = new Produto("Notebook", 3892.55, 0.85);
    System.out.println(isExpensive.test(produto));
    System.out.println(isExpensive.test(produto2));
  }
}
