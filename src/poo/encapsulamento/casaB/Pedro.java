package poo.encapsulamento.casaB;

import poo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

  void testeAcessos() {

//    System.out.println(mae.segredo);
//    System.out.println(mae.facoDentroDeCasa);
//    System.out.println(mae.formaDeFalar);
    System.out.println(super.formaDeFalar);  // Nao precisa instanciar a Ana pois é transmitido por heranca
    System.out.println(formaDeFalar);
    System.out.println(todosSabem);
    System.out.println(new Ana().todosSabem);
  }
}
