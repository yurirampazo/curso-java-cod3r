package model;

public class ValorNulo {
  public static void main(String[] args) {
    String s = "";
    System.out.println(s.concat("!!!"));

    Data d1 = Math.random() > 0.5 ? new Data() : null ;

    if (d1 != null) {
      d1.mes = 3;
    }

    String s2 = null;

    if (s2 != null) {
      System.out.println(s2.concat("???"));
    }

  }
}