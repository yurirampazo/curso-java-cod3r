package poo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
  String nome;
  List<Curso> cursos = new ArrayList<>();

  public Aluno(List<Curso> cursos) {
    this.cursos = cursos;
  }

  public Aluno(String nome) {
    this.nome = nome;
  }

  public Aluno() {
  }

  void adicionarCurso(Curso curso) {
    this.cursos.add(curso);
    curso.alunos.add(this);
  }

  Curso obterCursoPorNome(String nome) {
        for (Curso curso : this.cursos) {
      if (curso.nome.equals(nome)) {
        return curso;
      }
    }
    return new Curso();
  }

  @Override
  public String toString() {
    return this.nome;
  }
}
