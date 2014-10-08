package es.upm.miw.ecp2patrones.expression;

public abstract class ExpresionCompleja extends Expresion {
    protected Expresion operando1;
    protected Expresion operando2;

    public ExpresionCompleja(Expresion operando1, Expresion operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }
    
    @Override
    public abstract int operar();

    @Override
    public abstract String toString();

}
