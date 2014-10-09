package es.upm.miw.ecp2patrones.naturalNumber;

public abstract class NaturalNumber {
    private int value;

    private String[] text;

    public NaturalNumber(int value, String[] text) {
        this.setValue(value);
        this.text = text;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        assert value >= 0;
        this.value = value;
    }

    public void add(int value) {
        this.setValue(this.value + value);
    }

    public String getTextValue() {
        if (this.value < text.length) {
            return text[this.value];
        } else {
            return "???";
        }
    }

}
