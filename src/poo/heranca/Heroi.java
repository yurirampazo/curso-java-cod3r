package poo.heranca;

public class Heroi extends Jogador {

  public Heroi(int x, int y) {
    super(x,y);
  }

  @Override
  boolean atacar(Jogador oponente) {
    int deltaX = Math.abs(x - oponente.x);
    int deltaY = Math.abs(y - oponente.y);

    if (deltaX == 0 && deltaY == 1
          || deltaX == 1 && deltaY == 0) {
      oponente.vida -= 20;
      return true;
    }
    return false;
  }
}
