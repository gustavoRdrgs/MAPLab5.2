package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import contribuintes_Imposto.Medico;

public class TestMedico {

    Medico medicoTest = new Medico("nomeTest", 222, 86000, 60000, 55, 1000);

    @Test
    public void testarRiqueza() {
        assertEquals(medicoTest.calculaRiqueza(), 86000 + 60000 + (86000 + 60000) / 2, 0);
    }
    
    @Test 
    public void testarImposto() {
        assertEquals(medicoTest.calcularImpostoMedico(), 550,0);
    }

    @Test
    public void testarDesconto() {
        assertEquals(medicoTest.calculaDescontoMedico(), 1000,0);
    }
}
