package es.upm.miw.ecp2patrones.text;

public class Parrafo extends Compuesto {

    public Parrafo() {
        super();
    }

    @Override
    public void add(Componente componente) {
        if (!componente.isCompuesto()) {
            this.aniadirComponente(componente);
        } else {
            this.error();
        }
    }

    @Override
    public void remove(Componente componente) {
        if (!componente.isCompuesto()) {
           this.borrarComponente(componente);
        } else {
            this.error();
        }
    }

    @Override
    public String dibujarSeparador() {
        return "\n";
    }

}
