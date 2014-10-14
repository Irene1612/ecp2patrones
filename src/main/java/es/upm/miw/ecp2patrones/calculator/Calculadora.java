package es.upm.miw.ecp2patrones.calculator;

public class Calculadora {
    private int total;
    private int valorAnterior;

    public Calculadora() {
        this.iniciar();
    }

    public int getTotal() {
        return total;
    }

    protected void setTotal(int total) {
        this.total = total;
    }

    public void sumar(int valor) {
        this.valorAnterior = this.total;
        this.setTotal(this.total + valor);
    }

    public void restar(int valor) {
        this.valorAnterior = this.total;
        this.setTotal(this.total - valor);
    }

    public void iniciar() {
        this.valorAnterior = this.total;
        this.setTotal(0);
    }
    
    public void deshacer() {
        this.setTotal(this.valorAnterior);
    }
}
