package streams.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DesafioFilter {
  public static void main(String[] args) {
    /*
    * 1. Usar pelo menos 2 expressões Lambda para 2 filtros diferentes
    * 2. Finalizar usando um map.
    *
    * */

    Carro c1= new Carro("Buggatti Veyron", 1.001, 431.5);
    Carro c2= new Carro("Skyline", 573.5, 250.5);
    Carro c3= new Carro("Dodge Charger", 716.4, 270.5);
    Carro c4= new Carro("Bugatti Chiron", 1600.0, 490.5);
    Carro c5= new Carro("SSC Tuatara", 1774.0, 532.9);


    List<Carro> carros = Arrays.asList(c1, c2, c3, c4, c5);

    carros.stream()
          .filter(x -> x.velocidadeMaxima >= 300)
          .filter(x -> x.cavaloVapor > 1000)
          .map(x -> "Modelo: " + x.nome + " é um dos mais rápidos do mundo!!!")
          .forEach(System.out::println);

    Carro carroMaisRapido = new Carro();
    for (Carro carro : carros) {
      carroMaisRapido = (carro.getVelocidadeMaxima() > carroMaisRapido.getVelocidadeMaxima()) ? carro : carroMaisRapido;
    }

    System.out.println("O carro mais rápido do mundo é: \n" + carroMaisRapido);
  }
}
