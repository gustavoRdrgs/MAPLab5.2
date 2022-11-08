package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import contribuintes_Imposto.Caminhoneiro;

public class TestCaminhoneiro {

    Caminhoneiro caminhoneiroTest = new Caminhoneiro("nomeTest", 333, 50000, 50000, 500, 500000, 20);

    @Test
    public void testarRiqueza() {
        assertEquals(caminhoneiroTest.calculaRiqueza(), 150000, 0);
    }

    @Test
    public void testarImposto() {
        assertEquals(caminhoneiroTest.calcularImpostoCaminhao(), 0, 0);
    }
    
    @Test
    public void testarDesconto() {
        assertEquals(caminhoneiroTest.calcularDescontoCaminhao(), 5000, 0);
    }
}
