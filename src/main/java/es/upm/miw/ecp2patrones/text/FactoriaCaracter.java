package es.upm.miw.ecp2patrones.text;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {
    private static FactoriaCaracter factoria = null;

    private Map<Character, Caracter> caracteres;

    public FactoriaCaracter(){
        this.caracteres = new HashMap<>(); 
    }

    public static FactoriaCaracter getFactoria() {
        if (FactoriaCaracter.factoria == null) {
             FactoriaCaracter.factoria = new FactoriaCaracter();
        }
        return FactoriaCaracter.factoria;
    }

    public Caracter get(char c) {
        if(!this.caracteres.containsKey(c)){
            this.caracteres.put(c, new Caracter(c));
        }
        return caracteres.get(c);
    }

}
