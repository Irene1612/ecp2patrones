package es.upm.miw.ecp2patrones.text;

public class Texto extends Compuesto {

    public Texto() {
        super();
    }

    @Override
    public void add(Componente componente) {
        if (componente.isCompuesto()) {
            this.aniadirComponente(componente);
        } else {
            this.error();
        }        
    }

    @Override
    public void remove(Componente componente) {
        if (componente.isCompuesto()) {
            this.borrarComponente(componente);
        } else {
            this.error();
        } 
        
    }

    @Override
    public String dibujarSeparador() {
        return "---o---\n";
    }

}
