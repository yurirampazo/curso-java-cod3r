package collections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
  public static void main(String[] args) {
    Map<Integer, String> usuarios = new HashMap<>();

    usuarios.put(1, "Yuri");    // Put pois adiciona se a chave nao possui um valor atribuido a ela
    usuarios.put(1, "Yuri Rampazo");  //Sobreescreve se já existe um elemento com essa chave
    usuarios.put(20, "Ricardo");  //IMPORTANTE: Nao mantem as chaves ordenadas e nem os elementos
    usuarios.put(3, "Rafaela");
    usuarios.put(4, "Rebeca");

    System.out.println(usuarios.size());
    System.out.println(usuarios.isEmpty());

    System.out.println(usuarios.keySet());
    System.out.println(usuarios.values());
    System.out.println(usuarios.entrySet());  //Acessa chave e valor ao mesmo tempo

    System.out.println(usuarios.containsKey(1));
    System.out.println(usuarios.containsValue("Rodolfo"));

    System.out.println(usuarios.get(20));


    for (int chave : usuarios.keySet()) {
      System.out.println(chave);
    }


    for (String value : usuarios.values()) {
      System.out.println(value);
    }

    for (Map.Entry<Integer, String> usuario : usuarios.entrySet()) {
      System.out.println(usuario);
    }

    for (Map.Entry<Integer, String> usuario : usuarios.entrySet()) {
      System.out.print(usuario.getKey() + " -> ");
      System.out.println(usuario.getValue());
    }

    System.out.println(usuarios.remove(3));
    System.out.println(usuarios.remove(4, "Gui"));
  }
}
