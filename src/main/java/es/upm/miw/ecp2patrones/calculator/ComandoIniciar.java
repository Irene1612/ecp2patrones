package es.upm.miw.ecp2patrones.calculator;

public class ComandoIniciar extends Comando {
    
    private Calculadora calculadora;

    public ComandoIniciar(Calculadora calc) {
        this.calculadora=calc;
    }

    @Override
    public String name() {
        return "Iniciar";
    }

    @Override
    public void execute() {
        this.calculadora.iniciar();
    }

}
