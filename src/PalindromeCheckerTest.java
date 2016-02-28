import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeCheckerTest {

	@Test
	public void constructorTest() {
		PalindromeChecker testing = new PalindromeChecker("racecar");
		assertNotNull(testing);
	}
	
	@Test
	public void fillOriginialTest(){
		String test = "Race car";
		PalindromeChecker testing = new PalindromeChecker(test);
		testing.fillOriginal();
		assertNotNull(testing.original);
		assertEquals(testing.original.getSize(), test.length()-1);
		
	}
	
	@Test
	public void fillReverseTest(){
		String test = "Racecar";
		PalindromeChecker testing = new PalindromeChecker(test);
		testing.fillReverse();
		assertNotNull(testing.reverse);
		assertEquals(testing.reverse.getSize(), test.length());
	}
	
	@Test
	public void compareTest(){
		String test = "Racecar";
		PalindromeChecker testing1 = new PalindromeChecker(test);
		assertTrue(testing1.compare());
		assertEquals(testing1.reverse.getSize(), testing1.original.getSize());
		test = "hello5";
		PalindromeChecker testing2 = new PalindromeChecker(test);
		assertFalse(testing2.compare());
		test = "Race ~car";
		PalindromeChecker testing3 = new PalindromeChecker(test);
		assertTrue(testing3.compare());
	}

}
