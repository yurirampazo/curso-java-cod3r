package model;

import java.util.Objects;

public class Usuario {
  String nome;
  String email;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Usuario usuario = (Usuario) o;

    return Objects.equals(nome, usuario.nome);
  }

  @Override
  public int hashCode() {
    return nome != null ? nome.hashCode() : 0;
  }
}
