package es.upm.miw.ecp2patrones.factory;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.ecp2patrones.factory.FactoryReferences;

public class FactoryReferencesTest {
    private FactoryReferences factory;

    @Before
    public void before() {
        factory = new FactoryReferences();
        factory.getReference("cero");
    }

    @Test
    public void testGetReferenceNew() {
        assertEquals(1, factory.getReference("uno"));
    }

    @Test
    public void testGetReference() {
        assertEquals(0, factory.getReference("cero"));
    }
    
    @Test
    public void testRemoveReference() {
        factory.removeReference("cero");
        assertEquals(1, factory.getReference("cero"));
    }

}
