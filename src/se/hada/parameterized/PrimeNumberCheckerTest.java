package se.hada.parameterized;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//STEP1: RunWith (Parameterized.class)
@RunWith(Parameterized.class)
public class PrimeNumberCheckerTest {

	private Integer inputNumber;
	private Boolean expectedResult;
	private PrimeNumberChecker pnc;

	@Before
	public void initialize() {
		pnc = new PrimeNumberChecker();
	}

	public PrimeNumberCheckerTest(Integer inputNumber, Boolean expectedResult) {
		this.inputNumber = inputNumber;
		this.expectedResult = expectedResult;
	}

	// STEP2: public static method annotated with @Parameters that returns a collection of objects as Array as
	// test data set
	@Parameterized.Parameters
	public static Collection primeNumbers() {
		return Arrays.asList(new Object[][] {
			{ 2, true }, 
			{ 6, false }, 
			{ 19, true },
			{ 22, false }, 
			{ 23, true } 
		});
	}

	// This test will run 4 times since we have 5 parameters defined
	@Test
	public void testPrimeNumberChecker() {
		System.out.println("Parameterized Number is : " + inputNumber);
		assertEquals(expectedResult, pnc.validate(inputNumber));
	}
}
