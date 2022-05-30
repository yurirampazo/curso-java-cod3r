package poo.composicao;

public class CompraTeste {
  public static void main(String[] args) {

    Compra compra1 = new Compra();
    compra1.cliente = "João Pedro";
    compra1.adicionarItem("Caneta", 20, 7.45);  //Sobrecarga de método na classe instancia e chama o proximo
    compra1.adicionarItem(new Item("Borracha", 12, 3.89));
    compra1.adicionarItem(new Item("Caderno", 3, 18.79));
//    compra1.itens.add(new Item("Caderno", 3, 18.79));

    System.out.println(compra1.itens.size());
    System.out.println(compra1.obterValorTotal());


    //Não tem utilidade prática, exemplo de relação bidirecional e sua complexidade
    double total = compra1.itens.get(0).compra.itens.get(1).compra.obterValorTotal();
    System.out.println("O total é: " + total);
  }
}