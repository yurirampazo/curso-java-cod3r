package poo.heranca;

public class Jogo {
  public static void main(String[] args) {
    Jogador monstro = new Monstro();
    monstro.x =10;
    monstro.y =12;

    Jogador heroi = new Heroi(10,11);

    System.out.println("MONSTRO TEM: " + monstro.vida);
    System.out.println("HEROI TEM: " + heroi.vida);

    heroi.atacar(monstro);
    heroi.andar(Direcao.NORTE);
    monstro.atacar(heroi);
    System.out.println("MONSTRO TEM: " + monstro.vida);
    System.out.println("HEROI TEM: " + heroi.vida);

  }
}
