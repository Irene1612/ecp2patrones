package es.upm.miw.ecp2patrones.calculator;

public class MementoCalculadora {
    
    private int valorAntiguo;
    
    private String cadena;

    public MementoCalculadora(int valorAntiguo, String cadena) {
        this.valorAntiguo = valorAntiguo;
        this.cadena = cadena;
    }

    public int getValorAntiguo() {
        return valorAntiguo;
    }

    public String getCadena() {
        return cadena;
    }    
}
