package es.upm.miw.ecp2patrones.calculator;

import upm.jbb.IO;

public class ComandoSumar extends Comando {

   public ComandoSumar(CalculadoraMementable calc) {
        this.calculadora = calc;
    }

    @Override
    public String name() {
        return "Sumar";
    }

    @Override
    public void execute() {
        int valor = IO.in.readInt();
        this.calculadora.sumar(valor);
    }

}
