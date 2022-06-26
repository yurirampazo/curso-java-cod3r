package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
  public static void main(String[] args) throws SQLException {

    Scanner sc = new Scanner(System.in);

    System.out.println("Informe nome: ");
    String nome = sc.nextLine();

    Connection connection = FabricaConexao.getConnection();

    String sql = "INSERT INTO pessoas (nome) VALUES (?)";
    PreparedStatement stmt =
          connection.prepareStatement(sql);
    stmt.setString(1, nome);

    stmt.execute();

    System.out.println("Pessoa incluída com sucesso!!!");

    sc.close();
  }
}
