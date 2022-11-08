package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import contribuintes_Imposto.Professor;

public class TestProfessor {
    
    Professor professorTest = new Professor("NomeTest", 222, 65000, 45000, 4500, 400);

    @Test
    public void testarRiqueza() {
        assertEquals(professorTest.calculaRiqueza(), 65000 + 45000 + (65000 + 45000) / 2, 0);
    }

    @Test
    public void testarImposto() {
        assertEquals(professorTest.calcularImpostoProfessor(), 0, 0);
    }

    @Test 
    public void testarDesconto() {
        assertEquals(professorTest.calcularDescontoProfessor(), 400 / 2, 0);
    }
}
