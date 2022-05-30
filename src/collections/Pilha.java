package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
  public static void main(String[] args) {
    //LIFO  -> Last In First Out

    Deque<String> livros = new ArrayDeque<>();

    livros.add("O pequeno Principe");  //addLast
    livros.push("O Hobbit");  //addFirst
    livros.add("Don Quixote");

    System.out.println(livros);


    //Olhar Classe Fila para detalhes dos seguintes metodos:
    System.out.println(livros.peek());
    System.out.println(livros.element());

    System.out.println(livros.poll());
    System.out.println(livros.poll());
    System.out.println(livros.poll());
    System.out.println(livros.poll());
//    System.out.println(livros.remove());
    System.out.println(livros.pop());  //Igual ao remove. Lanca NoSuchElementException


    System.out.println(livros.size());
//    livros.clear();
//    livros.contains();
//    livros.isEmpty();
  }
}
