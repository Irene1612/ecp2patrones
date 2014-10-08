package es.upm.miw.ecp2patrones.expression;

public class Sumar extends ExpresionCompleja {

    public Sumar(Expresion exp1, Expresion exp2) {
       super(exp1, exp2);
    }

    @Override
    public int operar() {
        return this.operando1.operar() + this.operando2.operar();
    }

    @Override
    public String toString() {
        return "("+this.operando1.toString()+"+"+this.operando2.toString()+")";
    }

}
