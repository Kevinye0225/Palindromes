import java.util.EmptyStackException;

public class MyStack<T> {
	private MyGenericLinkedList<T> stackNode;
	private int size;
	
	/*
	 * Constructor
	 */
	public MyStack(){
		stackNode = new MyGenericLinkedList<T>();
		size = 0;
	}
	
	/*
	 * add elements to the top of stack(linekdlist), increment the size
	 */
	public void push(T value){
		stackNode.addFirst(value);
		size++;
	}
	
	/*
	 * return null if empty, otherwise return head value of linkedlist
	 */
	public T peek(){
		if (size == 0){
			return null;
		}
		MyGenericNode<T> temp = stackNode.head;
		return (T) temp.value;
	}
	
	/*
	 * return 0 upon 
	 */
	public T pop(){
		if (size == 0){
			throw new EmptyStackException();
		}
		T result = stackNode.head.value;
		stackNode.head = stackNode.head.next;
		size--;
		return result;
	}
	
	/*
	 * Check whether the stack is empty
	 */
	public boolean isEmpty(){
		if (size == 0){
			return true;
		}
		return false;
	}
	
//	public void display(){
//		stackNode.display();
//	}
	
	public int getSize(){
		return this.size;
	}
}
