package es.upm.miw.ecp2patrones.calculator;

import upm.jbb.IO;

public class ComandoImprimir extends Comando {
    
    private Calculadora calculadora;

    public ComandoImprimir(Calculadora calc) {
        this.calculadora=calc;
    }

    @Override
    public String name() {
        return "Imprimir";
    }

    @Override
    public void execute() {
        IO.out.println(this.calculadora.getTotal());        
    }

}
