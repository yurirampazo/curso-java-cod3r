package excecao;

import java.util.Scanner;

public class Finally {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    try {
      System.out.println(7 / sc.nextInt());
//      sc.close();
    } catch (/*OutOfMemoryError |*/ ArithmeticException e) {
      System.out.println("ERRO" + e.getMessage());
    } finally {
      System.out.println("Entrou no finally");
      sc.close();
    }
  }
}
