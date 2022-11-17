package de.demmer.dennis;

import java.util.Arrays;

public class Application {

	public static void main(String[] args) {

		// Aufgabe 1

		int[] intArray;
		intArray = new int[150];

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = 42;
		}

		System.out.println(Arrays.toString(intArray));
		
		
		// Aufgabe 1.1

		int[] intArrayRandomZero = new int[150];
		for (int i = 0; i < intArrayRandomZero.length; i++) {

			// zufällige Kommazahl zwischen 0 und 1 bsp. 0,8587
			double doubleRnd = Math.random();

			// Runden der Kommazahl auf 1L
			long rndLong = Math.round(doubleRnd);

			// Umwandeln des long in int
			int randomZero = (int) rndLong;

			// zuweisen des int
			intArrayRandomZero[i] = randomZero;

		}

		System.out.println(Arrays.toString(intArrayRandomZero));
		
		

		

		// ---------------Hausaufgabe 6 ----------------------

		boolean[] boolArr = func1(9);
		System.out.println(Arrays.toString(boolArr));

		int[] intArr = func2(boolArr);
		System.out.println(Arrays.toString(intArr));

		// ---------------------------------------------------

	}

	static boolean[] func1(int lengthToCheck) {
		boolean[] result = new boolean[lengthToCheck];

		for (int j = 0; j < result.length; j++) {

			if (j % 2 != 0 && j != 0) {
				result[j] = true;
			}
		}

		return result;
	}

	static int[] func2(boolean[] boolArr) {

		int[] intArr = new int[boolArr.length / 2];

		for (int i = 0; i < boolArr.length; i++) {

			if (boolArr[i]) {
				intArr[i / 2] = i;
			}
		}
		return intArr;
	}

}
