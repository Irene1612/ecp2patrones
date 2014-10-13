package es.upm.miw.ecp2patrones.text;

import java.util.ArrayList;
import java.util.List;

public abstract class Compuesto extends Componente {

    protected List<Componente> componentes;

    public Compuesto() {
        componentes = new ArrayList<Componente>();
    }

    @Override
    public abstract void add(Componente componente);

    @Override
    public abstract void remove(Componente componente);

    @Override
    public boolean isCompuesto() {
        return true;
    }

    @Override
    public String dibujar(boolean b) {
        String result = "";
        for (Componente componente : this.componentes) {
            result += componente.dibujar(b);
        }
        return result + this.dibujarSeparador();
    }

    protected abstract String dibujarSeparador();

    protected void  aniadirComponente(Componente componente){
        if (componente != null) {
            this.componentes.add(componente);
        }
    }
    
    protected void  borrarComponente(Componente componente){
        if (componente != null) {
            this.componentes.remove(componente);
        }
    }

}
