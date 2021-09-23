package TestCases;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import Model.Calculator;


public class TestCalculator {

	private Calculator calculator;
	
	
	@Before
	public void init() {
		calculator = new Calculator();
	}
	
	@Test
	public void emptyStringReturnsZero() throws Exception {
//		Calculator calculator = new Calculator();
		assertEquals(calculator.calculate(""),0);
	}
	
	@Test
	public void returnsSingleValue() throws Exception {
//		Calculator calculator = new Calculator();
		assertEquals(calculator.calculate("1"), 1);
	}

@Test
public void twoNumbersWithComaSum() throws Exception
{
	assertEquals(calculator.calculate("2,2"), 4);
}


@Test
public void twoNumbersWithSemiColanSum() throws Exception
{
	assertEquals(calculator.calculate("2;2\n2"), 6);
}


@Test
public void twoNewLineGiveSum() throws Exception {
	assertEquals(calculator.calculate("2\n2"), 4);
}

@Test
public void threeNewLineGiveSum() throws Exception {
	assertEquals(calculator.calculate("2,2,2"), 6);
}


@Test(expected = Exception.class)
public void negativeInputReturnsException() throws Exception
{
	calculator.calculate("-1");
}

@Test
public void ignoreGreterThan1000() throws Exception
{
	assertEquals(calculator.calculate("10,10,1001"),20);

}

}
