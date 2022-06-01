package poo.composicao;

public class CursoTeste {
  public static void main(String[] args) {
    var a1 = new Aluno("João");
    var a2 = new Aluno("Maria");
    var a3 = new Aluno("Pedro");


    var curso1 = new Curso("Java Completo");
    var curso2 = new Curso("GoLang Completo");
    var curso3 = new Curso("Node Completo");


    curso1.adicionarAluno(a1);
    curso1.adicionarAluno(a2);

    curso2.adicionarAluno(a2);
    curso2.adicionarAluno(a3);

    a1.adicionarCurso(curso3);
    a2.adicionarCurso(curso3);
    a3.adicionarCurso(curso3);

    for (Aluno aluno : curso1.alunos) {
      System.out.println("Estou matriculado no curso " + curso1.nome);
      System.out.println("E o meu nome é: " + aluno.nome);
    }

    System.out.println(curso3.alunos);

    Curso cursoEncontrado = a1.obterCursoPorNome("Java Completo");

    if (cursoEncontrado != null) {
      System.out.println(cursoEncontrado.nome);
      System.out.println(cursoEncontrado.alunos);
    }
  }
}
