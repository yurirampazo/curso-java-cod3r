package lambdas;

public class Soma implements Calculo {
  @Override
  public double executar(int x, int y) {
    return x + y;
  }
}
