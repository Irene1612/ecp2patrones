package es.upm.miw.ecp2patrones.calculator;

import java.util.HashMap;
import java.util.Map;

public class GestorMementos<T> {
    
    private Map<String, T> lista = new HashMap<String, T>();

    public void addMemento(String key, T memento) {
        this.lista.put(key, memento);
    }

    public T getMemento(String key) {
        return this.lista.get(key);
    }

    public String[] keys() {
        return this.lista.keySet().toArray(new String[0]);
    }
}
