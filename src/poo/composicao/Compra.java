package poo.composicao;

import java.util.ArrayList;

public class Compra {

  ArrayList<Item> itens = new ArrayList<>();
  String cliente;

  void adicionarItem(String nome, int quantidade, double preco) {
    this.adicionarItem(new Item(nome, quantidade, preco));
  }
  void adicionarItem(Item item) {
    this.itens.add(item);
    item.compra = this;
  }

  double obterValorTotal() {
    double total = 0.0;

    for (Item item : itens) {
      total += item.quantidade * item.preco;
    }

    return total;
  }


}
