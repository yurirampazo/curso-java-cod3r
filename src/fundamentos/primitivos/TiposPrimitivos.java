package fundamentos.primitivos;

public class TiposPrimitivos {
  public static void main(String[] args) {
    // I nformações do funcionário

    //Tipos numéricos inteiros
    byte anosDeEmpresa = 23;
    short numeroDeVoos = 567;
    int id = 56789;
    long pontosAcumulados = 3_234_845_223L;

    //Tipos Numéricos reais
    float salaraio = 11_445_44F;
    double vendasAcumuladas = 2_991_797_103.01;

    //Tipo booleano
    boolean estaDeFerias = true;  //Pode ser false também

    //Tipo Caractere
    char status = 'A'; //Ativo
    char s ='\u0000';   //Hack da tabela unicode, esse numero equivale a um caractere

    //Dias empresa
    System.out.println(anosDeEmpresa * 365);

    //Numero Viagens
    System.out.println(numeroDeVoos/2);

    //Pontos por real
    System.out.println(pontosAcumulados / vendasAcumuladas);

    System.out.println(id + ": ganha -> " + salaraio);
    System.out.println("Férias? " + estaDeFerias);
    System.out.println("Status: " + status);

  }
}
