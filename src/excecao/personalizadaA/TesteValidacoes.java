package excecao.personalizadaA;

import excecao.Aluno;

public class TesteValidacoes {
  public static void main(String[] args) {

    Aluno a1 = new Aluno("Yuri", 7.0);

    try {
      Validar.aluno(a1);
      Validar.aluno(null);
    } catch (StringVaziaException e) {
      System.out.println(e.getMessage());
//      Duas exceções com o mesmo tratamento podem ser unidas assim com um pipe |
    } catch (NumeroForaIntervaloException  | IllegalArgumentException e) {
      System.out.println("Erro: " + e.getMessage());
    }

    System.out.println("Fim :)");
  }
}
