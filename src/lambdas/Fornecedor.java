package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
  public static void main(String[] args) {

    Supplier<List<String>> lista = () -> Arrays.asList("Ana", "Bia", "Lia", "Gui");
    //Quando não existem parâmetros na entrada é obrigatório o uso de parentesis.
    // A unica forma em que se pode suprimir o uso de parentesis é quando temos 1 parametro apenas.
    //Ex: x -> x.something
    // (x,y) -> x + y;
    // () -> x

    System.out.println(lista.get());
    System.out.println(lista.get().get(3));
  }
}
