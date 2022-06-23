package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
  public static void main(String[] args) {
    List<String> langs = Arrays.asList("JS", "PHP", "Java", "C++" );
    List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);


    // O método sempre retorna um object sem generics no retorno, por isso sempre terá de ser feito o casting
    String ultimaLang = (String) ListaUtil.getUltimo1(langs);
    System.out.println(ultimaLang);

    Integer ultimoNumero = (Integer) ListaUtil.getUltimo1(nums);
    System.out.println(ultimoNumero);


    //Utilizando Generics no método static não é necessário fazer casting
    String ultimaLang2 = ListaUtil.getUltimo2(langs);
    System.out.println(ultimaLang2);

    Integer ultimoNumero2= ListaUtil.getUltimo2(nums);
    System.out.println(ultimoNumero2);

  }
}
