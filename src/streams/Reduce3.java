package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
  public static void main(String[] args) {

    Aluno a1 = new Aluno("Ana", 7.1);
    Aluno a2 = new Aluno("Gabi", 6.1);
    Aluno a3 = new Aluno("Gui", 8.1);
    Aluno a4 = new Aluno("Luna", 10.0);

    List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

    Predicate<Aluno> aprovado = x -> x.nota >= 7.0;
    Function<Aluno, Double> apenasNota = x -> x.nota;
    BiFunction<Media, Double, Media> calcularMedia =
          (media, nota) -> media.adicionar(nota);

    BinaryOperator<Media> combinarMedia = Media::combinar;

    Media media = alunos.stream()
          .filter(aprovado)
          .map(apenasNota)
          .reduce(new Media(), calcularMedia, combinarMedia);

    System.out.println("A média do aluno é: " + media.getValor());
  }
}
