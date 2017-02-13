package rgqancy;

import java.lang.String;

public class Program {

	public static void main(String[] args) {
		int[] intArray = { 5, 3, 1, 2, 4, 6 };
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i]);
		}
		
		System.out.println();

		intArray = bubbleSort(intArray);
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i]);
		}
	}

	public static int[] bubbleSort(int[] intArray) {
		int temp;

		for (int i = intArray.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (intArray[i] < intArray[j]) {
					temp = intArray[i];
					intArray[i] = intArray[j];
					intArray[j] = temp;
				}
			}
		}

		return intArray;
	}
}
