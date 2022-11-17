package problem_First;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CalculatorTest 
{

	private static Calculator calc;
	
@BeforeAll	
public static void	beforeAllTests()
{
	calc=new Calculator();
	System.out.println("Once Before all tests....");	
}

@BeforeEach	
public void beforeEachTest()
{
	System.out.println("Before each test....");
}


//test for addition
@Test
public void testAdd()
{
  assertEquals(10,calc.addition(5, 5));
	
}

//test for multiplication
@Test
public void testmul()
{
  assertEquals(100,calc.multiply(10,10));
	
}


@AfterEach
public void afterEachTest()
{

	System.out.println("After each test....");
}

@AfterAll
public static void afterAllTests()
{
	System.out.println("Once After all tests....");	
}

}
