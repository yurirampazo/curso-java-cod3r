package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
  public static void main(String[] args) throws SQLException {

//    final String stringDeConexao = "jdbc:mysql://localhost/3307";  // Por padrão o mysql utiliza porta 3306
//    String url = "jdbc:mysql://localhost";
    String url = "jdbc:mysql://localhost:3306?VerifyServerCertificate=false&useSSL=false";

    final String usuario = "yuri";
    final String senha = "123456";

    Connection conexao = DriverManager.getConnection(url,usuario, senha);


    System.out.println("A conexão foi efetuada com sucesso!");
    conexao.close();

  }
}
