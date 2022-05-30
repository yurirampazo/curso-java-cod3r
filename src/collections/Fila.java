package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
  public static void main(String[] args) {
    Queue fila = new LinkedList();

    fila.add("Ana");   //Gera erro
    fila.offer("Bia");  // retorna falso
    fila.offer("Carlos");
    fila.offer("Daniel");
    fila.offer("Rafaela");
    fila.offer("Gui");


//    fila.clear();

    //Métodos para acessar o proximo elemento da fila sem removelo.
    //Diferença é que se estiver vazia, retornam:
    System.out.println(fila.peek());  // Retorna null
    System.out.println(fila.peek());
    System.out.println(fila.element());  // Retorna NoSuchElementException
    System.out.println(fila.element());

    fila.size();
    fila.isEmpty();


    //Acessam o proximo e retiram-o da fila
    //Diferenca de comportamento quando a fila esta vazia:
    System.out.println(fila.poll());   // Retorna null
    System.out.println(fila.poll());
    System.out.println(fila.poll());
    System.out.println(fila.poll());
    System.out.println(fila.poll());
    System.out.println(fila.poll());
    System.out.println(fila.poll());
//    System.out.println(fila.remove());  //Retorna NoSuchElementException

  }
}
