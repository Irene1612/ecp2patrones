package es.upm.miw.ecp2patrones.calculator;

import upm.jbb.IO;

public class ComandoDeshacer extends Comando {

    private GestorMementos<MementoCalculadora> gestorMementos;
    
    public ComandoDeshacer(Calculadora calc) {
        this.calculadora = calc;
    }

    @Override
    public String name() {
        return "Deshacer";
    }

    @Override
    public void execute() {
        this.calculadora.deshacer(this.gestorMementos.getMemento((String) IO.in.select(gestorMementos.keys(), "Restaurar")));
    }

}
