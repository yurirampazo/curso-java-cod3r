package streams.desafios;

public class Produto {
  String nome;
  Double preco;
  Double desconto;
  Double frete;

  public Produto() {
  }

  public Produto(String nome, Double preco, Double desconto, Double frete) {
    this.nome = nome;
    this.preco = preco;
    this.desconto = desconto;
    this.frete = frete;
  }
}
