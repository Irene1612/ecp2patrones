package es.upm.miw.ecp2patrones.naturalNumber;

public class NaturalNumberFrCreator extends NaturalNumberCreator {

    @Override
    public NaturalNumber createNaturalNumber(int value) {
       return new NaturalNumberFr(value);
    }
   
}
