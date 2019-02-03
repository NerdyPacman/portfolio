package pigLatin;
import java.util.Scanner;

public class PigLatin {
	public static void main(String args[]) {
		try(Scanner scanner = new Scanner(System.in)){
			char[] vowels = {'a', 'e', 'i', 'o', 'u'};
			String normalSuffix = "ay";
			String vowelSuffix = "way";
			
			String input = scanner.nextLine().toLowerCase();
			char[] inputArray = input.toCharArray();
			char[] newArray = inputArray;
			
			for(int i=0;i<inputArray.length;i++) {
				if(isElementInArray(inputArray[i], vowels)) {
					if(i == 0) {
						newArray = ArrayAppend(newArray, vowelSuffix.toCharArray());
						break;
					} else {
						newArray = ArrayAppend(newArray, normalSuffix.toCharArray());
						break;
					}
				} else {
					newArray = removeElementAtIndex(newArray, 0);
					newArray = ArrayAppend(newArray, inputArray[i]);
				}
			}
			System.out.println(new String(newArray));
		}
	}
	
	public static Boolean isElementInArray(char e, char[] array) {
		for(int i=0;i<array.length;i++) {
			if(e == array[i]) {
				return true;
			}
		}
		return false;
	}
	
	public static char[] ArrayAppend(char[] a1, char[] a2) {
		char[] a3 = new char[a1.length + a2.length];
		for(int i=0;i<a1.length;i++) {
			a3[i] = a1[i];
		}
		for(int i=0;i<a2.length;i++) {
			a3[i + a1.length] = a2[i];
		}
		return a3;
	}
	
	public static char[] ArrayAppend(char[] a1, char character) {
		char[] tempArray = new char[1];
		tempArray[0] = character;
		return ArrayAppend(a1, tempArray);
	}
	
	public static char[] removeElementAtIndex(char[] array, int index) {
		char[] newArray = new char[array.length - 1];
		int j = 0;
		for(int i=0;i<array.length;i++) {
			if(i != index) {
				newArray[j] = array[i];
				j++;
			}
		}
		return newArray;
	}
}
