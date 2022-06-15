package lambdas;

@FunctionalInterface
public interface Calculo {
  double executar(int x, int y);

  default String legal() {
    return "legal";
  }

  static String muitoLegal() {
    return "muito legal";
  }
}
