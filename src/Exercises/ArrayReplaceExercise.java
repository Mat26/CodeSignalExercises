package Exercises;

public class ArrayReplaceExercise {

	public static void main(String[] args) {
		int[] inputArray = {1,2,1};
		System.out.println("Test1: " + arrayReplace(inputArray,1,3));//[3,2,3]

	}

	static int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] == elemToReplace) {
				inputArray[i] = substitutionElem;
			}
		}
		return inputArray;
	}

}
