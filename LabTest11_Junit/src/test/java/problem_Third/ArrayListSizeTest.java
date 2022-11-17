package problem_Third;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ArrayListSizeTest 
{
	ArrayListSize als=new 	ArrayListSize();
	@BeforeAll	
	public static void	beforeAllTests()
	{
		System.out.println("Once Before all tests....");	
	}

	@BeforeEach	
	public void beforeEachTest()
	{
		System.out.println("Before each test....");
	}
	
	
	//Test for checking size of arraylist
	@Test
	public void arraySize() 
	{
		assertEquals(5,als.size());
    }
	
	//Test for checking arraylistEmpty or not
	@Test
	public void empty() 
	{
		assertTrue(als.isEmpty());
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
