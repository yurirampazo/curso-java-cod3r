package streams.desafios;

import java.util.Comparator;

public class Carro  implements Comparator<Carro> {
  String nome;
  Double cavaloVapor;
  Double velocidadeMaxima;

  public Carro() {
    this("Default",0.0, 0.0);
  }

  public Carro(String nome, Double cavaloVapor, Double velocidadeMaxima) {
    this.nome = nome;
    this.cavaloVapor = cavaloVapor;
    this.velocidadeMaxima = velocidadeMaxima;
  }

  public Double getVelocidadeMaxima() {
    return velocidadeMaxima;
  }

  @Override
  public int compare(Carro o1, Carro o2) {
    return o1.getVelocidadeMaxima().compareTo(o2.velocidadeMaxima);
  }

  @Override
  public String toString() {
    return "Modelo: " + nome + "\n" +
          "CV =" + cavaloVapor + "\n" +
          "VelocidadeMaxima=" + velocidadeMaxima + "km/h.";
  }
}
