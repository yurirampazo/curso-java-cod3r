package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
  public static Connection getConnection() throws SQLException {
    try {
      final String url = "jdbc:mysql://localhost:3306/curso_java?VerifyServerCertificate=false&useSSL=true";
      final String user = "yuri";
      final String password = "123456";

      Connection connection = DriverManager.getConnection(url, user, password);
      return connection;
    } catch (SQLException e) {
      throw new RuntimeException(e.getCause().getMessage());
    }
  }
}
