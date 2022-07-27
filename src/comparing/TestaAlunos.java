package comparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestaAlunos {
  public static void main(String[] args) {

    Set<String> alunos = new HashSet<>();
    alunos.add("Yuri");
    alunos.add("Janaina");
    alunos.add("Daniel");
    alunos.add("Savio");
    alunos.add("Debora");
    alunos.add("Felipe");
    alunos.add("Felipe");  //Não duplica itens

    System.out.println(alunos);

    //LEGADO
//    Iterator<String> alunosIt = alunos.iterator();
//    while (alunosIt.hasNext()) {
//      String proximoAluno = alunosIt.next();
//      System.out.println(proximoAluno);
//    }


    alunos.forEach(System.out::println);
    System.out.println(alunos.size());
    System.out.println("Yuri está matriculado? " + alunos.contains("Yuri"));


    List<String> listaAlunos = new ArrayList<>(alunos);
    listaAlunos.sort(String::compareTo);
    listaAlunos.forEach(System.out::println);
    System.out.println(listaAlunos.get(2));





//    Set<String> nomes = Collections.emptySet();
//    nomes.add("Paulo"); //o que acontece aqui?
  }
}
