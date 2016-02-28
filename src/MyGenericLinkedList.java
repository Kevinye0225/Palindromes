/**
 * Our implementation of LinkedList using MyNode.
 * @author Kevin
 *
 */
public class MyGenericLinkedList<T> {

	public MyGenericNode<T> head;
	public int size;

	/**
	 * The constructor - initializes an empty linked list.
	 */
	public MyGenericLinkedList() {
		head = null;
		size = 0;
	}

	/**
	 * This method will create a new node.
	 * It will add it as the first node of the linked list.
	 * @param value the value to be added
	 */
	public void addFirst(T value) {

		MyGenericNode<T> node = new MyGenericNode<T>(value);
		node.next = head;
		head = node;

		size++;
	}

	/**
	 * This method will create a new node.
	 * It will add it as the last node of the linked list.
	 * @param value the value to be added
	 */
	public void addLast(T value) {

		if (size == 0) {
			addFirst(value);
		} else {
			MyGenericNode<T> node = new MyGenericNode<T>(value);

			MyGenericNode<T> i = head;

			//			don't want to modify head directly
			//			shouldn't do head.next = node;

			while (i.next != null) {
				i = i.next;
			}

			i.next = node;
			size++;
		}
	}

	/**
	 * This methods displays the contents of the linked list.
	 */
	public void display() {

		if (size != 0) {


			MyGenericNode<T> i = head;

			System.out.println("Printing out the contents of the linked list");

			while (i.next != null) {
				System.out.print(i.value + " ---> ");
				i = i.next;
			}
			
			System.out.print(i.value);
		}
	}

}
