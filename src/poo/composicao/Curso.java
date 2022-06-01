package poo.composicao;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {
  String nome;
  List<Aluno> alunos = new ArrayList<>();

  public Curso(String nome) {
    this.nome = nome;
  }

  public Curso() {
  }

  public Curso(List<Aluno> alunos) {
    this.alunos = new ArrayList<>();
  }

  void adicionarAluno(Aluno aluno) {
    this.alunos.add(aluno);
    aluno.cursos.add(this);  //Relação Bidirecional
  }
}
