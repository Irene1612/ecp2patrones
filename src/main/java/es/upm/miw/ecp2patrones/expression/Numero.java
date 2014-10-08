package es.upm.miw.ecp2patrones.expression;

public class Numero extends Expresion {
    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    @Override
    public int operar() {        
        return this.numero;
    }

    @Override
    public String toString() {
        return ""+this.numero;
    }

}
