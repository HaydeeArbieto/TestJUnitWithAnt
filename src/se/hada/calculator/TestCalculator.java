package se.hada.calculator;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCalculator {

	@Test
	public void evaluateExpression() {
		Calculator c = new Calculator();
		
		int sum = c.evaluate("1+2+3");
		assertEquals(6, sum);
	}
}
