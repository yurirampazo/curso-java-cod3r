package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TesteHash {
  public static void main(String[] args) {
    Set<Usuario> usuarios = new HashSet<>();
//    List<Usuario> usuarios = new ArrayList<>(); // No caso de List da true pois Não usa o hash ocmo comparador

    usuarios.add(new Usuario("Pedro"));
    usuarios.add(new Usuario("Ana"));
    usuarios.add(new Usuario("Guilherme"));

    boolean resultado = usuarios.contains(new Usuario("Guilherme"));  //True pois tem o hashcode implementado
    System.out.println(resultado);


  }
}
