package model;

public class ValorVsReferencia {
  public static void main(String[] args) {
    double a = 2;
    double b = a;  // Atribuição por valor (Tipo primitivo)

    a++;
    b--;

    System.out.println(a + " " + b);

    Data data = new Data(1,6,2022);
    Data data1 = data; //Atribuição por referência (Tipo objeto)

    data.dia = 31;
    data.mes = 12;
    data.ano = 2025;

    System.out.println(data.obterDataFormatada());
    System.out.println(data1.obterDataFormatada());

    voltarDataParaValorPadrao(data);
    System.out.println(data.obterDataFormatada());
    System.out.println(data1.obterDataFormatada());

    int c = 5;
    alterarPrimitivo(c);
    System.out.println(c);

  }

  static void voltarDataParaValorPadrao(Data d) {
    d.dia = 1;
    d.mes = 2;
    d.ano = 1970;
  }

  static void alterarPrimitivo(int a) {
    a++;
  }
}
