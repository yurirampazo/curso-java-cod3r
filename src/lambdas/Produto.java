package lambdas;

public class Produto {
  final String nome;
  final Double preco;
  final Double desconto;

  public Produto(String nome, Double preco, Double desconto) {
    this.nome = nome;
    this.preco = preco;
    this.desconto = desconto;
  }

  @Override
  public String toString() {
    return "Produto{" +
          "nome='" + nome + '\'' +
          ", preco=" + preco +
          '}';
  }
}
