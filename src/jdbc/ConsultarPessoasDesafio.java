package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoasDesafio {
  public static void main(String[] args) throws SQLException {

    Scanner sc = new Scanner(System.in);

    Connection connection = FabricaConexao.getConnection();
    String sql = "SEKECT * FROM pessoas WHERE nome LIKE ?";

    System.out.println("Informe o valor para pesquisa: ");
    String nome = sc.nextLine();

    PreparedStatement stmt = connection.prepareStatement(sql);
    stmt.setString(1,"%" + nome  + "%");

    ResultSet resultQuery = stmt.executeQuery();

    List<Pessoa> pessoas = new ArrayList<>();

    while(resultQuery.next()) {
      int code = resultQuery.getInt("codigo");
      String name = resultQuery.getString("nome");
      pessoas.add(new Pessoa(code, name));
    }

    pessoas.forEach(x -> System.out.println(x.getCodigo() + " => " + x.getNome()));

    sc.close();
  }
}
