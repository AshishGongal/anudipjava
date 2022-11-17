package problem_Second;


import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class PalindromeTest 
{
	 static Palindrome pali;
	
	@BeforeAll	
	public static void	beforeAllTests()
	{
		pali=new Palindrome();
		System.out.println("Once Before all tests....");	
	}

	@BeforeEach	
	public void beforeEachTest()
	{
		System.out.println("Before each test....");
	}
	
    //Test for Palindrome
	@ParameterizedTest
	@ValueSource(strings = {"racecar", "radar", "papa", "madam"})
	public void palindrome(String value) 
	{
		assertTrue(pali.isPalindrome(value));
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
