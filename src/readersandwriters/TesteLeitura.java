package readersandwriters;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class TesteLeitura {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(new File("contas.csv"));
    while (sc.hasNextLine()) {
      String linha = sc.nextLine();
      System.out.println(linha);

      Scanner scLinha = new Scanner(linha);
      scLinha.useDelimiter(",");

      String valor1 = scLinha.next();
      Integer valor2 = scLinha.nextInt();
      BigDecimal valor3 = scLinha.nextBigDecimal();

      System.out.println(valor1);
      System.out.println(valor2);
      System.out.println(valor3);

//      String[]valores = linha.split(",");
//      System.out.println(Arrays.toString(valores));
//      System.out.println(valores[3]);
      scLinha.close();
    }
    sc.close();
  }
}
