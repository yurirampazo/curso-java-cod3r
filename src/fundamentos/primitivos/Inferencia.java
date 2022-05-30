package fundamentos.primitivos;

public class Inferencia {
  public static void main(String[] args) {
    double a = 4.5; //Declaração e inicializção de variável

    double ab;  //Declaração de variável
    ab = 10.9;  //Inicialização de variável

    //var abc;  //Esse trecho apresentará erro pelo compilador
    //abc = 1;

    var b = 4.5;
    //Java vai inferir pelo valor atribuido a variavel, qual é seu tipó
    System.out.println(a);
    System.out.println(b);

    var c = "Essa variavel é uma String";
    System.out.println(c);

    c = "Essa variavel continua sendo uma String";
    System.out.println(c);

  }
}
