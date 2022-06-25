package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class MinMax {
  public static void main(String[] args) {
    Aluno a1 = new Aluno("Ana", 7.1);
    Aluno a2 = new Aluno("Luna", 6.1);
    Aluno a3 = new Aluno("Gui", 8.1);
    Aluno a4 = new Aluno("Gabi", 10.0);

    List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
    Predicate<Aluno> aprovado = x -> x.nota >= 7.0;

    Comparator<Aluno> melhorNota = (x, y) -> {
      if (x.nota > y.nota) return 1;
      if (x.nota < y.nota) return -1;
      return 0;
    };

    Comparator<Aluno> piorNota = (x, y) -> {
      if (x.nota < y.nota) return 1;
      if (x.nota > y.nota) return -1;
      return 0;
    };

    System.out.println(alunos.stream().max(melhorNota).get());
    System.out.println(alunos.stream().min(melhorNota));

    System.out.println(alunos.stream().max(piorNota).get());
    System.out.println(alunos.stream().min(piorNota));
  }
}
