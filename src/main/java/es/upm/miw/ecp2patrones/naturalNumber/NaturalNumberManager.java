package es.upm.miw.ecp2patrones.naturalNumber;

public class NaturalNumberManager {

    private NaturalNumber number;

    private NaturalNumberCreator creator;

    public void createNaturalNumber(int value) {
        this.number = this.creator.createNaturalNumber(value);
    }

    public void setNaturalNumberCreator(NaturalNumberCreator creator) {
        this.creator = creator;
    }
    
    public String getTextValue(){
        return this.number.getTextValue();
    }
}
