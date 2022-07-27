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
    String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";

    System.out.println("Informe o valor para pesquisa: ");
    String valor = sc.nextLine();

    //Usamos "% para indicar partes de uma string, que queremos retornar,
    // Ex: buscar pessoas que contenham %ri% no nome retornará Yuri, Ariana, Mariana, etc."
    PreparedStatement stmt = connection.prepareStatement(sql);
    stmt.setString(1,"%" + valor  + "%");

    ResultSet resultQuery = stmt.executeQuery();

    List<Pessoa> pessoas = new ArrayList<>();

    while(resultQuery.next()) {
      int code = resultQuery.getInt("codigo");
      String name = resultQuery.getString("nome");
      pessoas.add(new Pessoa(code, name));
    }

    pessoas.forEach(x -> System.out.println(x.getCodigo() + " => " + x.getNome()));

    sc.close();
    connection.close();
    stmt.close();
  }
}
