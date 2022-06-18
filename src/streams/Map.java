package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Map {
  public static void main(String[] args) {

    Consumer<String> print = System.out::print;

    List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");
    marcas.stream().map(x -> x.toUpperCase()).forEach(print);

//    UnaryOperator<String> maiuscula = x -> x.toUpperCase();
    UnaryOperator<String> primeiraLetra = x -> x.charAt(0) + "";  //Gambiarra
//    UnaryOperator<String> grito = y -> y + "!!!";

//    new Utilitarios();  //Encapsulamento

    System.out.println("\nUsando composição: ");
    marcas.stream()
          .map(Utilitarios.maiuscula)
          .map(primeiraLetra)
          .map(Utilitarios::grito)
          .forEach(print);

  }
}
