package poo.encapsulamento;

public class Pessoa {
  private int idade;

  public Pessoa(int idade) {
    setIdade(idade);
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    idade = Math.abs(idade);
    if (idade >= 0 && idade <= 120) {
      this.idade = idade;
    }
  }
}
