package generics;

public class CaixaObjetoTeste {
  public static void main(String[] args) {

    CaixaObjeto caixa = new CaixaObjeto();
    caixa.setCoisa(2.3);


//    Double valorCoisa = caixa.getCoisa();  //Exception, não compila
    Double valorCoisa = (Double) caixa.getCoisa();
    System.out.println(valorCoisa);
  }
}
