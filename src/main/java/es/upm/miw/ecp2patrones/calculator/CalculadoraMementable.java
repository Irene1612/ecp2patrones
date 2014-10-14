package es.upm.miw.ecp2patrones.calculator;

public class CalculadoraMementable extends Calculadora implements Mementable<MementoCalculadora> {
    private int valorAntiguo;

    private String cadena;

    public CalculadoraMementable() {
    }

    public int getValorAntiguo() {
        return valorAntiguo;
    }

    public void setValorAntiguo(int valorAntiguo) {
        this.valorAntiguo = valorAntiguo;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    @Override
    public MementoCalculadora guardar() {
        return new MementoCalculadora(this.valorAntiguo, this.cadena);
    }   

    @Override
    public void deshacer(MementoCalculadora memento) {
        this.setValorAntiguo(memento.getValorAntiguo());
        this.setCadena(memento.getCadena());
    }

}
