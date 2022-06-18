package streams;

import java.util.function.UnaryOperator;

public class Utilitarios {
  private Utilitarios() {}

  public final static UnaryOperator<String> maiuscula = x -> x.toUpperCase();

  public final static UnaryOperator<String> primeiraLetra = x -> x.charAt(0) + "";  //Gambiarra

  public  final static String grito(String n) {
    return  n + "!!!";
  }
}
