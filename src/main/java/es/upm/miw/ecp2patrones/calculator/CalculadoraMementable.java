package es.upm.miw.ecp2patrones.calculator;

public class CalculadoraMementable extends Calculadora implements Mementable<MementoCalculadora> {
    private String cadena;

    public CalculadoraMementable() {
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    @Override
    public MementoCalculadora guardar() {
        return new MementoCalculadora(this.total, this.cadena);
    }   

    @Override
    public void deshacer(MementoCalculadora memento) {
        this.total = memento.getValorAntiguo();
    }

}
