package generics;

public class CaixaNumeroTeste {
  public static void main(String[] args) {
    CaixaNumero<Double> caixaA = new CaixaNumero<>();
    caixaA.setCoisa(2.3);
    System.out.println(caixaA.getCoisa());

    CaixaNumero<Integer> caixaB = new CaixaNumero<>();
    caixaB.setCoisa(123);
    System.out.println(caixaB.getCoisa());

    CaixaNumero<Long> caixaC = new CaixaNumero<>();
    caixaC.setCoisa(1L);
    System.out.println(caixaC.getCoisa());

    CaixaNumero<Float> caixaD = new CaixaNumero<>();
    caixaD.setCoisa(12F);
    System.out.println(caixaD.getCoisa());
  }
}
