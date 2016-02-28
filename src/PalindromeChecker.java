
public class PalindromeChecker {
	private String value;
	public MyStack<Character> original;
	public MyStack<Character> reverse;
	
	/*
	 * Constructor takes in a string that will be checked whether it is a palindrome
	 */
	public PalindromeChecker(String value){
		this.value = value;
		original = new MyStack<Character>();
		reverse = new MyStack<Character>();
	}
	
	/*
	 * Fill the original stack with one letter at a time
	 */
	public void fillOriginal(){
		for (int i = 0; i<value.length(); i++){
			char input = value.charAt(i);
			if (input >= 65 && input <= 90){
				original.push(input);
			}
			if (input >= 48 && input <= 57){
				original.push(input);
			}
			if (input >= 97 && input <= 122){
				original.push(input);
			}
		}
	}
	
	/*
	 * Fill the reverse stack one letter at a time in a reverse order
	 */
	public void fillReverse(){
		for (int i = value.length()-1; i >= 0; i--){
			char input = value.charAt(i);
			if (input >= 65 && input <= 90){
				reverse.push(input);
			}
			if (input >= 48 && input <= 57){
				reverse.push(input);
			}
			if (input >= 97 && input <= 122){
				reverse.push(input);
			}
		}
	}
	
	/*
	 * Call the two methods above, and compare two stacks
	 * if not equals, return false, otherwise return true.
	 */
	public boolean compare(){
		this.fillOriginal();
		this.fillReverse();
		int size = original.getSize();

		for (int i = 0; i<size; i++){
			if (original.peek() != reverse.peek()){
				if (Math.abs(original.peek() - reverse.peek()) != 32){
					System.out.println(this.value + " is not a palindrome");
					return false;
				}
			}
			original.pop();
			reverse.pop();
		}
		return true;
	}
	

}
