package es.upm.miw.ecp2patrones.naturalNumber;

public class NaturalNumberEs extends NaturalNumber {
    private static final String[] textValue = {"cero", "uno", "dos", "tres", "cuatro", "cinco"};

    public NaturalNumberEs(int value) {
        super(value, NaturalNumberEs.textValue);
    }
}
