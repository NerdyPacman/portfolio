package axolotlLib;

public class Array {
	public static Boolean isElementInArray(char e, char[] array) {
		for(int i=0;i<array.length;i++) {
			if(e == array[i]) {
				return true;
			}
		}
		return false;
	}
	
	public static Boolean isElementInArray(int e, int[] array) {
		for(int i=0;i<array.length;i++) {
			if(e == array[i]) {
				return true;
			}
		}
		return false;
	}
	
	public static Boolean isElementInArray(float e, float[] array) {
		for(int i=0;i<array.length;i++) {
			if(e == array[i]) {
				return true;
			}
		}
		return false;
	}
	
	public static Boolean isElementInArray(String e, String[] array) {
		for(int i=0;i<array.length;i++) {
			if(e == array[i]) {
				return true;
			}
		}
		return false;
	}
	
	public static char[] append(char[] a1, char[] a2) {
		char[] a3 = new char[a1.length + a2.length];
		for(int i=0;i<a1.length;i++) {
			a3[i] = a1[i];
		}
		for(int i=0;i<a2.length;i++) {
			a3[i + a1.length] = a2[i];
		}
		return a3;
	}
	
	public static int[] append(int[] a1, int[] a2) {
		int[] a3 = new int[a1.length + a2.length];
		for(int i=0;i<a1.length;i++) {
			a3[i] = a1[i];
		}
		for(int i=0;i<a2.length;i++) {
			a3[i + a1.length] = a2[i];
		}
		return a3;
	}
	
	public static float[] append(float[] a1, float[] a2) {
		float[] a3 = new float[a1.length + a2.length];
		for(int i=0;i<a1.length;i++) {
			a3[i] = a1[i];
		}
		for(int i=0;i<a2.length;i++) {
			a3[i + a1.length] = a2[i];
		}
		return a3;
	}
	
	public static String[] append(String[] a1, String[] a2) {
		String[] a3 = new String[a1.length + a2.length];
		for(int i=0;i<a1.length;i++) {
			a3[i] = a1[i];
		}
		for(int i=0;i<a2.length;i++) {
			a3[i + a1.length] = a2[i];
		}
		return a3;
	}
	
	public static char[] append(char[] a1, char e) {
		char[] tempArray = new char[1];
		tempArray[0] = e;
		return Array.append(a1, tempArray);
	}
	
	public static int[] append(int[] a1, int e) {
		int[] tempArray = new int[1];
		tempArray[0] = e;
		return Array.append(a1, tempArray);
	}
	
	public static float[] append(float[] a1, float e) {
		float[] tempArray = new float[1];
		tempArray[0] = e;
		return Array.append(a1, tempArray);
	}
	
	public static String[] append(String[] a1, String e) {
		String[] tempArray = new String[1];
		tempArray[0] = e;
		return Array.append(a1, tempArray);
	}
	
	public static char[] removeElement(char[] array, int index) {
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
	
	public static int[] removeElement(int[] array, int index) {
		int[] newArray = new int[array.length - 1];
		int j = 0;
		for(int i=0;i<array.length;i++) {
			if(i != index) {
				newArray[j] = array[i];
				j++;
			}
		}
		return newArray;
	}
	
	public static float[] removeElement(float[] array, int index) {
		float[] newArray = new float[array.length - 1];
		int j = 0;
		for(int i=0;i<array.length;i++) {
			if(i != index) {
				newArray[j] = array[i];
				j++;
			}
		}
		return newArray;
	}
	
	public static String[] removeElement(String[] array, int index) {
		String[] newArray = new String[array.length - 1];
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
