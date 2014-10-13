package es.upm.miw.ecp2patrones.text;

public abstract class Componente {

    public abstract void add(Componente componente);
    
    public abstract void remove(Componente componente);
    
    public abstract boolean isCompuesto();

    public abstract String dibujar(boolean b);
    
    protected void error() {
        throw new UnsupportedOperationException("Operación no soportada");
    }

}
