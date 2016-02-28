import static org.junit.Assert.*;

import org.junit.Test;

public class MyStackTest {
//    private MyStack<Integer> testing;
	
	@Test
	public void test() {
//		testing = new MyStack<Integer>();
	}
	
	@Test
	public void pushTest(){
		MyStack<Integer> testing = new MyStack<Integer>();
		
		testing.push(5);
		assertNotNull(testing);
		assertEquals(testing.getSize(), 1);
	}
	
	@Test
	public void peekTest(){
		MyStack<Integer> testing = new MyStack<Integer>();
		assertNull(testing.peek());
		testing.push(6);
		int value = testing.peek();
		assertEquals(value, 6);
	}
	
	@Test
	public void popTest(){
		MyStack<Integer> testing = new MyStack<Integer>();
		testing.push(6);
		assertEquals(testing.getSize(), 1);
		int testValue = testing.pop();
		assertEquals(testValue,6);
		assertEquals(testing.getSize(), 0);
		
		
	}
	
	@Test
	public void isEmptyTest(){
		MyStack<Integer> testing = new MyStack<Integer>();
		
		assertTrue(testing.isEmpty());
		testing.push(6);
		assertFalse(testing.isEmpty());
	}
	


}
