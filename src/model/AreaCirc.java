package model;

public class AreaCirc {
  double raio;
  static final double PI = 3.14159;

  public AreaCirc(double raio) {
    this.raio = raio;
  }

  double area() {
    return Math.pow(raio, 2);
  }
}
