package model;

public class Data {
  int dia;
  int mes;
  int ano;

  public Data() {
  }

  public Data(int dia, int mes, int ano) {
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
  }

  public String obterDataFormatada() {
    return this.dia +"/" + this.mes + "/" + this.ano;
  }
}
