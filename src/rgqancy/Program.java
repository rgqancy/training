package rgqancy;

import java.lang.String;

public class Program {

	public static void main(String[] args) {
		int[] intArray = {5,3,1,2,4,6};
		System.out.print(intArray);
		//bubbleSort(intArray);
	}

	public static <T> T[] bubbleSort(T[] array) {
		if (array == null) {
			System.out.println("to sorted array is not allowed empt.");
		}

		T temp;

		for (int i = array.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[i].toString().compareTo(array[j].toString()) > 0 ) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
}
