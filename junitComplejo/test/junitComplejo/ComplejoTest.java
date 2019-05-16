package junitComplejo;

import static org.junit.Assert.*;

import org.junit.Test;

public class ComplejoTest {

	@Test
	public void testSumaComplejos(){
        // 1. Arrange 
        Complejo c1 = new Complejo(3, 5);
        Complejo c2 = new Complejo(1, -1);
        // 2. Act
        Complejo resultado1 = c1.sumar(c2);
        Complejo resultado2 = c2.sumar(c1);
        // 3. Assert
        assertEquals(resultado1.getParteReal(),4,0.0000001);
        assertEquals(resultado1.getParteImaginaria(),4,0.0000001);

  }     

}
