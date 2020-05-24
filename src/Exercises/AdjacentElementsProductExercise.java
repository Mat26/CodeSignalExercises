package Exercises;

public class AdjacentElementsProductExercise {

	public static void main(String[] args) {
		int [] a = {3, 6, -2, -5, 7, 3};
		int [] a2 = {-1, -2};
		int [] a3 = {5, 1, 2, 3, 1, 4};
		int [] a4 = {1, 2, 3, 0};
		int [] a5 = {9, 5, 10, 2, 24, -1, -48};
		System.out.println("TEST 1: " + adjacentElementsProduct(a));
		System.out.println("TEST 2: " + adjacentElementsProduct(a2));
		System.out.println("TEST 3: " + adjacentElementsProduct(a3));
		System.out.println("TEST 4: " + adjacentElementsProduct(a4));
		System.out.println("TEST 5: " + adjacentElementsProduct(a5));
	}

	static int adjacentElementsProduct(int[] inputArray) {
		int max = 0;
		for (int i = 1; i < inputArray.length; i++) {
			int primer = inputArray[i - 1];
			int contrincante = primer * inputArray[i];
			if (i == 1) {
				max = primer * inputArray[i];
			}
			if (max < contrincante) {
				max = contrincante;
			}
		}
		return max;
	}

}
