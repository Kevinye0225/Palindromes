import static org.junit.Assert.*;

import org.junit.Test;

public class MyGenericNodeTest {

	@Test
	public void constructorTest() {
		MyGenericNode<Integer> test = new MyGenericNode<Integer>(5);
		assertNotNull(test);
		assertEquals((int)test.value, 5);
		assertNull(test.next);
	}

}
