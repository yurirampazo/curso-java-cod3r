package fundamentos;

public class Parsing {
  public static void main(String[] args) {

//    Para parsear valores para classe Wrapper utilizasse o método valueOf
//  Para parsear para valores literais primitivos usamos o parse


    String num = "29";

    Integer numWrapper = Integer.valueOf(num);
    System.out.println("Wrapper" + numWrapper + ", classe: " + numWrapper.getClass().getSimpleName());

    int numPrimitivo = Integer.parseInt(num);
    System.out.println("Primitivo: " + numPrimitivo);   // Não é possivel buscar a classe pois ão é um tipo object

  }
}
