package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
  public static void main(String[] args) {

    Aluno a1 = new Aluno("Jana", 7.8);
    Aluno a2 = new Aluno("Bia", 5.8);
    Aluno a3 = new Aluno("Gabi", 9.8);
    Aluno a4 = new Aluno("Savio", 6.8);
    Aluno a5 = new Aluno("Daniel", 7.1);
    Aluno a6 = new Aluno("Felipe", 8.8);

    List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

    Predicate<Aluno> estaAprovado = x -> x.nota >= 7.0;
    Function <Aluno, String> saudacaoAprovado = a -> "Parabéns " + a.nome + " você foi aprovado!";

//    alunos.stream().filter(estaAprovado);
    alunos.stream().filter(x -> x.nota >= 7.0)//Expressão inline
//          .map(saudacaoAprovado)
          .map(a -> "Parabéns " + a.nome + " você foi aprovado!")
          .forEach(System.out::println);



  }
}
