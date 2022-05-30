package model;

public class AreaCircApplication {
  public static void main(String[] args) {
    AreaCirc a = new AreaCirc(5.6);
    System.out.println(a.area());

    AreaCirc a1 = new AreaCirc(10);
    System.out.println(a1.area());

    AreaCirc a2 = new AreaCirc(5);
    //a1.pi = 0;
    System.out.println(a.area());
    System.out.println(a1.area());
    System.out.println(a2.area());
  }
}
