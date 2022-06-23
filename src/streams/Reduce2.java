package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce2 {
  public static void main(String[] args) {

    Aluno a1 = new Aluno("Ana", 7.1);
    Aluno a2 = new Aluno("Gabi", 6.1);
    Aluno a3 = new Aluno("Gui", 8.1);
    Aluno a4 = new Aluno("Luna", 10.0);

//    BinaryOperator<Double> soma = (x, y) -> x + y;

    List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
    alunos.stream()
          .filter(x -> x.nota >= 7.0)
          .map(x -> x.nota)
//          .reduce(soma);
//          .reduce((x, y) -> x + y)
          .reduce(Double::sum)
          .ifPresent(System.out::println);
  }
}
