package reverseAString;
import java.util.Scanner;

public class ReverseAString {
	public static void main(String args[]) {
		try(Scanner scanner = new Scanner(System.in)) {
			String input = scanner.nextLine();
		
			char[] inputArray = input.toCharArray();
			char[] reversedInputArray = new char[inputArray.length];
		
			for(int i=0;i<inputArray.length;i++) {
				reversedInputArray[i] = inputArray[inputArray.length - i - 1];
			}
		
			String reversedInput = new String(reversedInputArray);
			System.out.println(reversedInput);
		}
	}
}
