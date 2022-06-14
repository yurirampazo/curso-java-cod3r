package poo.heranca.desafio;

public class Carro {
  final int VELOCIDADE_MAXIMA;
  int velocidadeAtual;

  public Carro(int velocidadeMaxima) {
    VELOCIDADE_MAXIMA = velocidadeMaxima;
  }

  void acelerar() {
    velocidadeAtual += 5;
  }

  void frear() {
    if (velocidadeAtual >= 5) {
      velocidadeAtual -= 5;
    } else {
      velocidadeAtual = 0;
    }
  }

  public String toString() {
    return  "Velocidade atual é " + velocidadeAtual + "km/h";
  }
}
