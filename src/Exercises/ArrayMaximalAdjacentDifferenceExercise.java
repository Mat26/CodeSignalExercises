package Exercises;

public class ArrayMaximalAdjacentDifferenceExercise {

	public static void main(String[] args) {
    int[] inputArray = {2,4,1,0};
    System.out.println("Test1: " + arrayMaximalAdjacentDifference(inputArray));//3
	}

	static int arrayMaximalAdjacentDifference(int[] inputArray) {
		int max = 0;
		for (int i = 0; i < inputArray.length - 1; i++) {
			if (inputArray[i] < inputArray[i + 1] && max < (inputArray[i + 1] - inputArray[i])) {
				max = inputArray[i + 1] - inputArray[i];
			}
			if (inputArray[i] > inputArray[i + 1] && max < (inputArray[i] - inputArray[i + 1])) {
				max = inputArray[i] - inputArray[i + 1];
			}
		}
		return max;
	}

}
