package test;


import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert .*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	Calculator cal;
	
	@Before
	public void setup() {
		cal = new Calculator();
		System.out.println("setup");
	}

	@Test
	public void add() {
		assertEquals(7, cal.add(3,  4));
		System.out.println("add");
	}
	
	@Test
	public void minus() throws Exception {
		int result = cal.minus(4, 3);
		assertEquals(1, result);
		System.out.println("minus");
	}
	
	@After
	public void teardown() {
		System.out.println("teardown");
	}
}
