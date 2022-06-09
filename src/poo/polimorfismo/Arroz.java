package poo.polimorfismo;

public class Arroz extends Alimento {
//  private double peso;

  public Arroz(double peso) {
    super(peso);
  }

  public double getPeso() {
    return super.getPeso();
  }

  public void setPeso(double peso) {
    if (peso >= 0) super.setPeso(peso);
  }
}
