package lambdas;

public class Multiplicacao implements Calculo {
  @Override
  public double executar(int x, int y) {
    return x * y;
  }
}
