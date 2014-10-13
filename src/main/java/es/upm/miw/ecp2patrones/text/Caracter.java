package es.upm.miw.ecp2patrones.text;

public class Caracter extends Componente {

    private char c;

    public Caracter(char caracter) {
        this.c = caracter;
    }

    @Override
    public String dibujar(boolean mayusculas) {
        if (mayusculas) {
            return ("" + c).toUpperCase();
        }
        return "" + c;
    }

    @Override
    public void add(Componente componente) {
        if (componente.isCompuesto()) {
            this.error();
        }
    }

    @Override
    public void remove(Componente componente) {
    }

    @Override
    public boolean isCompuesto() {
        return false;
    }

}
