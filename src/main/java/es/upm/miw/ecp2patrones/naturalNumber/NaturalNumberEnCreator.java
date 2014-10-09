package es.upm.miw.ecp2patrones.naturalNumber;

public class NaturalNumberEnCreator extends NaturalNumberCreator {

    @Override
    public NaturalNumber createNaturalNumber(int value) {
       return new NaturalNumberEn(value);
    }
   
}
