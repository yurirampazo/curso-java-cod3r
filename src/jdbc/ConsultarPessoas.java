package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoas {
  public static void main(String[] args) throws Exception {
    Connection connection = FabricaConexao.getConnection();

    String sql = "SELECT * FROM pessoas";

    //Como nesse caso não serão passados paraâmetros podemos utilizar a interface Statement
    // ao invés da PreparedStatement
    Statement stmt = connection.createStatement();
//    stmt.execute(sql);
    ResultSet retornoQuery = stmt.executeQuery(sql);
    List<Pessoa> pessoas = new ArrayList<>();


    while (retornoQuery.next()) {

      int codigo = retornoQuery.getInt("codigo");
      String nome = retornoQuery.getString("nome");

      pessoas.add(new Pessoa(codigo, nome));
    }

    pessoas.forEach(x -> System.out.println(x.getCodigo() + " -> " + x.getNome()));

    stmt.close();
    connection.close();

  }
}
