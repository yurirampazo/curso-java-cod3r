package datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {
  public static void main(String[] args) {

    LocalDate hoje = LocalDate.now();
    LocalDate copa2022 = LocalDate.of(2022, Month.NOVEMBER, 1);

    System.out.println("Hoje: " + hoje);

    int anos = copa2022.getYear() - hoje.getYear();
    System.out.println("Faltam: " + anos + " para a copa de 2022");

    Period periodo = Period.between(hoje, copa2022);

    System.out.println(periodo);
    System.out.println(periodo.getDays());
    System.out.println(periodo.getMonths());
//    System.out.println(periodo.getYears());
//    System.out.println(periodo.getUnits());

    LocalDate proximaCopa = copa2022.plusYears(4);
    System.out.println(proximaCopa.getYear());
    System.out.println(proximaCopa);

    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
    System.out.println(formatador.format(proximaCopa));

    LocalDateTime agora = LocalDateTime.now();
    System.out.println(formatadorComHoras.format(agora));

    LocalDate hoje1 = agora.toLocalDate();
    System.out.println(formatador.format(hoje1));

    LocalTime intervalo = LocalTime.of(22, 17);
    System.out.println(intervalo);

  }
}
