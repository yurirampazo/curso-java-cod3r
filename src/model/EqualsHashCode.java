package model;

public class EqualsHashCode {
  public static void main(String[] args) {
    Usuario u1 = new Usuario();
    u1.nome = "Yuri";
    u1.email = "ymrampazo@gmail.com";

    Usuario u2 = new Usuario();
    u2.nome = "Yuri";
    u2.email = "ymrampazo@gmail.com";

    System.out.println(u1 == u2);
    System.out.println(u1.equals(u2));
    System.out.println(u1.hashCode() == u2.hashCode());

  }
}
