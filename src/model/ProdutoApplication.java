package model;

import java.util.Scanner;

public class ProdutoApplication {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = 3;
    Produto p = new Produto();
    p.nome = "Notebook";
    p.preco = 4356.89;
    p.desconto = 0.29;

    var p2 = new Produto();
    p2.nome = "Caneta Preta";
    p.desconto = 0.29;

    System.out.println(p.nome);
    System.out.println(p2.nome);

    double precoFinal1 = p.preco * (1 - p.desconto);
    double precoFinal2 = p2.preco * (1 - p.desconto);
    double mediaCarrinho = (precoFinal1 + precoFinal2 ) / 2;

    System.out.printf("Média do carrinho = R$.2f", mediaCarrinho);

  }
}
