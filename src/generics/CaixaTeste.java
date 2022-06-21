package generics;

public class CaixaTeste {
  public static void main(String[] args) {

    Caixa<String> caixa = new Caixa<>();
    caixa.setCoisa("Segredo");

    String valorCoisa = caixa.getCoisa();
    System.out.println(valorCoisa);
  }
}
