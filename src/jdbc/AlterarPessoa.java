package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarPessoa {
  public static void main(String[] args) throws SQLException {

    Scanner sc = new Scanner(System.in);

    System.out.println("Informe o código da pessoa: ");
    int codigo = sc.nextInt();
    sc.nextLine();

    String sql = "SELECT codigo, nome  FROM pessoas WHERE codigo = ?";
    Connection conexao = FabricaConexao.getConnection();
    PreparedStatement stmt = conexao.prepareStatement(sql);
    stmt.setInt(1, codigo);

    ResultSet result = stmt.executeQuery();
    if (result.next()) {
      Pessoa pessoa = new Pessoa(result.getInt(1), result.getString(2));

      System.out.println("Nome: " + pessoa.getNome());
      System.out.println("\nInforme o novo nome: ");
      String novoNome = sc.nextLine();

      sql = "UPDATE pessoas SET nome = ? WHERE codigo = ?";

      stmt.close();
      stmt = conexao.prepareStatement(sql);
      stmt.setInt(2, codigo);
      stmt.setString(1, novoNome);
      stmt.execute();

      System.out.println("Pessoa alterada com sucesso!");
    } else {
      System.out.println("Pessoa não encontrada!");
    }

    conexao.close();
    sc.close();
  }
}
