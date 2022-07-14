package comparing;

import java.math.BigDecimal;

public class Conta implements Comparable<Conta> {
  private String titular;
  private Integer numero;
  private BigDecimal saldo;

  public Conta() {
  }

  public Conta(String titular, Integer numero, Double saldo) {
    this.titular = titular;
    this.numero = numero;
    this.saldo = BigDecimal.valueOf(saldo);
  }

  public String getTitular() {
    return titular;
  }

  public void setTitular(String titular) {
    this.titular = titular;
  }

  public Integer getNumero() {
    return numero;
  }

  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  public BigDecimal getSaldo() {
    return saldo;
  }

  public void depositar(Double valor) {
    this.saldo = this.saldo.add(BigDecimal.valueOf(valor));
  }

  @Override
  public String toString() {
    return "Conta{" +
          "titular='" + titular + '\'' +
          ", numero=" + numero +
          ", saldo=" + saldo +
          '}';
  }

  @Override
  public int compareTo(Conta o) {
    return this.getSaldo().compareTo(o.getSaldo());
  }
}
