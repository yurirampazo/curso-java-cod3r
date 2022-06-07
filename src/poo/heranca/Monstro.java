package poo.heranca;

public class Monstro extends Jogador {

  public Monstro() {
    super(0,0);
  }

  public Monstro(int x, int y) {
    super(x,y);
  }

  boolean atacar(Jogador oponente) {
    return super.atacar(oponente);
  }
}
