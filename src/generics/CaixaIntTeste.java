package generics;

public class CaixaIntTeste {
  public static void main(String[] args) {

//    Quando na classe filha ainda não é especificada a classe!
//    CaixaInt<Integer> caixa = new CaixaInt<>();
    CaixaInt caixa = new CaixaInt();
    caixa.setCoisa(123);

    Integer valorCoisa = caixa.getCoisa();
    System.out.println(valorCoisa);
  }
}
