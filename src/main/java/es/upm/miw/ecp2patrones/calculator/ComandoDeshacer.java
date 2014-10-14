package es.upm.miw.ecp2patrones.calculator;

public class ComandoDeshacer extends Comando {

    private Calculadora calculadora;
    
    public ComandoDeshacer(Calculadora calc) {
        this.calculadora = calc;
    }

    @Override
    public String name() {
        return "Deshacer";
    }

    @Override
    public void execute() {
        this.calculadora.deshacer();
    }

}
