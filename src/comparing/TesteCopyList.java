package comparing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TesteCopyList {
  public static void main(String[] args) {

    List<String> frasesImutaveis = Arrays.asList("Olá", "Por Favor", "Obrigado", "VÁ COM DEUS");

    List<String> frases = new ArrayList<>(frasesImutaveis);
    System.out.println(frases);

    frases.sort(String::compareTo);
    System.out.println(frases);
  }
}
