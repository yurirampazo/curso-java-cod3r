package poo.heranca;

public class Jogador {
  int vida = 100;
  int x;
  int y;

  public Jogador(int x, int y) {
    this.x = x;
    this.y = y;
  }

//  public Jogador() {
//    this(0,0);
//  }

  boolean atacar(Jogador oponente) {
    int deltaX = Math.abs(x - oponente.x);
    int deltaY = Math.abs(y - oponente.y);

    if (deltaX == 0 && deltaY == 1
          || deltaX == 1 && deltaY == 0) {
      oponente.vida -= 10;
      return true;
    }
    return false;
  }

  boolean andar(Direcao direcao) {

    switch (direcao) {
      case NORTE:
        y++;
        break;
      case LESTE:
        x++;
        break;
      case SUL:
        y--;
        break;
      case OESTE:
        x--;
        break;

      default:
        return false;
    }
    return true;


  }


}
