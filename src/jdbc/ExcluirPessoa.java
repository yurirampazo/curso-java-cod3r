package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
  public static void main(String[] args) throws SQLException {

    Scanner sc = new Scanner(System.in);

    Connection conexao = FabricaConexao.getConnection();
    String sql = "DELETE FROM pessoas WHERE codigo = ?";

    System.out.println("Informe o código da pessoa para exclusão: ");
    int codigo = sc.nextInt();


    PreparedStatement stmt = conexao.prepareStatement(sql);
    stmt.setInt(1, codigo);
    stmt.execute();

//    Execute Update deveria indicar a quantidade de linhas afetadas
//    System.out.println("Linhas afetadas: " + stmt.executeUpdate(sql));

    sc.close();
    conexao.close();
  }
}
