package id.co.ant.calculator;

import org.junit.*;
//import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	private Calculator calculator = new Calculator();

	@Test
	public void testSum() {
		assertEquals(5, calculator.sum(2, 3));
	}
}