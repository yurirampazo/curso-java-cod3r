package poo.composicao;

public class Motor {

  boolean ligado = false;
  double fatorInjecao = 1.0;
  final Carro carro;

  public Motor(Carro carro) {
    this.carro = carro;
  }

  int giros() {
    if (ligado) {
      return (int) Math.round(fatorInjecao * 3000);
    }
    return 0;
  }


}
