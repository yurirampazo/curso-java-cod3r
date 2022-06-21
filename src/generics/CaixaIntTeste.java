package generics;

public class CaixaIntTeste {
  public static void main(String[] args) {

    CaixaInt/*<Integer>*/ caixa = new CaixaInt();
    caixa.setCoisa(123);

    Integer valorCoisa = caixa.getCoisa();
    System.out.println(valorCoisa);
  }
}
