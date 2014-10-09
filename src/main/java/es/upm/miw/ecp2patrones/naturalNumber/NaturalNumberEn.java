package es.upm.miw.ecp2patrones.naturalNumber;

public class NaturalNumberEn extends NaturalNumber {
   private static final String[] textValue = {"zero", "one", "two", "three", "four", "five"};

    public NaturalNumberEn(int value) {
        super(value, NaturalNumberEn.textValue);
    }
}
