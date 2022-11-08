package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import contribuintes_Imposto.Taxista;

public class TestTaxista {

    Taxista taxistaTest = new Taxista("NomeTest", 222, 75000, 50000, 260, 150000, 5400);
    
    @Test
    public void testarRiqueza() {
        assertEquals(taxistaTest.calculaRiqueza(), 75000 + 50000 + (75000 + 50000) / 2, 0);
    }

    @Test
    public void testarDesconto() {
        assertEquals(taxistaTest.calcularDescontoTaxi(), 1500,0);
    }

    @Test
    public void testarImposto() {
        assertEquals(taxistaTest.calcularImpostoTaxi(), 2700,0);
    }
}
