package calculation;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculationTest {
	
	Calculation calc = new Calculation();

	@Test
	public void testAdd() {
		assertSame(100, calc.add(50, 50));
	}

	@Test
	public void testSubtract() {
		assertSame(50, calc.subtract(75, 25));
	}

	@Test
	public void testMultiply() {
		assertSame(45, calc.multiply(9, 5));
	}

	@Test
	public void testDivide() {
		assertSame(2.4, calc.divide(12, 5));
	}

}
