package es.upm.miw.ecp2patrones.calculator;

public interface Mementable<T> {
    T guardar();

    void deshacer(T memento);
}
