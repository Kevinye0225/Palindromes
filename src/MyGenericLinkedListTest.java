import static org.junit.Assert.*;

import org.junit.Test;

public class MyGenericLinkedListTest {

	@Test
	public void constructorTest() {
		MyGenericLinkedList<Integer> test = new MyGenericLinkedList<Integer>();
		assertNull(test.head);
		assertEquals(test.size, 0);
	}
	
	@Test
	public void addFirstTest(){
		MyGenericLinkedList<Integer> test = new MyGenericLinkedList<Integer>();
		test.addFirst(5);
		assertNotNull(test.head);
		assertEquals((int)test.head.value, 5);
		assertEquals(test.size, 1);
		
	}
	
	@Test
	public void addLastTest(){
		MyGenericLinkedList<Integer> test = new MyGenericLinkedList<Integer>();
		test.addLast(5);
		assertNotNull(test.head);
		assertEquals((int)test.head.value, 5);
		test.addLast(6);
		MyGenericNode<Integer> next = test.head.next;
		assertEquals((int)next.value, 6);
		assertEquals(test.size, 2);
//		Test case when adding last element with more than 2 exisitng elements in the list
		test.addLast(7);
		assertEquals((int)next.next.value, 7);
		assertEquals(test.size, 3);
	}
	
	@Test
	public void display(){
		MyGenericLinkedList<Integer> test = new MyGenericLinkedList<Integer>();
		test.display();
		assertNotNull(test);
		test.addFirst(5);
		test.display();
		assertNotNull(test);
		test.addFirst(6);
		test.display();
		assertNotNull(test);
	}

}
