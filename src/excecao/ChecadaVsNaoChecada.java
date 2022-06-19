package excecao;

public class ChecadaVsNaoChecada {
  public static void main(String[] args) /*throws Exception*/ {
    try {
      geraErro1();
    } catch (Exception e) {
      System.out.println((e.getMessage()));
    }
    try {
      geraErro2();
    } catch (Throwable e) {  //Maneira mais genérica de tratamento de erros.
      System.out.println(e.getMessage());
    }
    System.out.println("Fim :)");
  }
  //  Não checada ou não verificada
  static void geraErro1() {
    throw new RuntimeException("Ocorreu um erro #01");
  }

  //  Exceção checada ou verificada
  static void geraErro2() throws Exception {
//    try {
      throw new Exception("Ocorreu um erro #02");
//    } catch (Exception e) {
//      System.out.println("Que legal");
//    }
  }
}
