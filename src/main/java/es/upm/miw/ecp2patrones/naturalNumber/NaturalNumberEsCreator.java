package es.upm.miw.ecp2patrones.naturalNumber;

public class NaturalNumberEsCreator extends NaturalNumberCreator {

    @Override
    public NaturalNumber createNaturalNumber(int value) {
       return new NaturalNumberEs(value);
    }
   
}
