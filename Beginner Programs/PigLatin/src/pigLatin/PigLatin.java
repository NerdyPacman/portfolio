package pigLatin;
import java.util.Scanner;
import axolotlLib.Array;

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
				if(Array.isElementInArray(inputArray[i], vowels)) {
					if(i == 0) {
						newArray = Array.append(newArray, vowelSuffix.toCharArray());
						break;
					} else {
						newArray = Array.append(newArray, normalSuffix.toCharArray());
						break;
					}
				} else {
					newArray = Array.removeElement(newArray, 0);
					newArray = Array.append(newArray, inputArray[i]);
				}
			}
			System.out.println(new String(newArray));
		}
	}
}
