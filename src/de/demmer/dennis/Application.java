package de.demmer.dennis;

import java.util.Arrays;

public class Application {

	public static void main(String[] args) {

		// ----------------------Aufgabe 1----------------------

		//Array mit 150 leeren Plätzen erzeugen
		int[] intArray = new int[150];
		
		//Eine Schleife die von 150 mal läuft und bei jedem durchgang i um 1 erhöht 
		for (int i = 0; i < intArray.length; i++) {
			//An jeder Postition wird eine 42 eingefügt
			intArray[i] = 42;
		}

		//Arrays.toString(hierDeinArray) ist eine hilfreiche Methode um aus Arrays leserliche Strings zu machen
		System.out.println(Arrays.toString(intArray));
		
		// ------------------------------------------------------
		
		
		
		
		
		
		// ---------------------- Aufgabe 1.1----------------------

		
		//Array mit 150 leeren Plätzen erzeugen

		int[] intArrayRandomZero = new int[150];
		for (int i = 0; i < intArrayRandomZero.length; i++) {

			// zufällige Kommazahl zwischen 0 und 1 (bsp. 0.8587)
			double doubleRnd = Math.random();

			// Runden der Kommazahl auf 1L
			long rndLong = Math.round(doubleRnd);

			// Umwandeln des long in int
			int randomZero = (int) rndLong;

			// zuweisen des int in das Array
			intArrayRandomZero[i] = randomZero;

		}

		System.out.println(Arrays.toString(intArrayRandomZero));
		
		// ------------------------------------------------------
		
		
		
		
		

		

		// ---------------Hausaufgabe 6 ----------------------

		boolean[] boolArr = func1(9);
		System.out.println(Arrays.toString(boolArr));

		int[] intArr = func2(boolArr);
		System.out.println(Arrays.toString(intArr));

		// ---------------------------------------------------

	}
	
	
	
	//func1()
	//Schreiben Sie eine Funktion func1(), die ein int-Argument nimmt und ein boolean-Array zurückliefert (boolean[]). 
	//Die Funktion soll für alle (ganzen) Zahlen (die größer Null sind) ermitteln, ob sie ungerade sind, und das Ergebnis davon in einem Array speichern. 
	//Dieses wird dann zurückgegeben. Das zurückgegebene Array sollte also so lange sein, wie das Argument das wir bekommen haben. 

	static boolean[] func1(int lengthToCheck) {
		boolean[] result = new boolean[lengthToCheck];

		for (int j = 0; j < result.length; j++) {

			if (j % 2 != 0 && j != 0) {
				result[j] = true;
			}
		}

		return result;
	}
	
	
	
	
	//func1()
    //Die Funktion func2() bekommt ein boolean-Array als Argument und liefert ein int-Array zurück. 
	//Das int-Array enthält die Index-Positionen des Argumentes, an denen true steht. 
	//Wenn Sie also den Rückgabewert von func1() hier übergeben, bekommen Sie ein Array mit nur den ungeraden Zahlen.
	
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
