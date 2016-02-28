import java.util.InputMismatchException;
import java.util.Scanner;

public class PalindromeCheckerTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = null;
		System.out.println("Please enter a word: ");
		try {
			in = new Scanner(System.in);
			String input = in.nextLine();
			PalindromeChecker test = new PalindromeChecker(input);

			if (test.compare()){
				System.out.println(input + " is a palindrome");
			}
			
		} catch (InputMismatchException e){
			e.printStackTrace();
		}
		in.close();
		
		


		


	}

}
