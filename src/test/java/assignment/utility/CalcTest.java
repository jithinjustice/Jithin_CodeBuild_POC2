package assignment.utility;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import assignment.utility.Calc;


public class CalcTest {
	
	static Calc calculator;
	@BeforeClass
	public static void initialization(){
		Calc calculator = new Calc();
	}
	
	
	@Test
	public void testSum(){		
		Calc calculator = new Calc();
	
		
		Assert.assertEquals(4, calculator.sum(2, 2),0);
		
	}
	@Test
	public void testsqrt(){		
		Calc calculator = new Calc();
	

		Assert.assertEquals(2, calculator.findRoot(4),0);
		
	}
	
}
