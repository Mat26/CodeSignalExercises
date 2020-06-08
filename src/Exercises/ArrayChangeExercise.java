package Exercises;

public class ArrayChangeExercise {

	public static void main(String[] args) {
      int[] inputArray = {1,1,1};
      System.out.println("Test1: " + arrayChange(inputArray));//3
	}

	static int arrayChange(int[] inputArray) {
		int count = 0;
		for (int i = 0; i < inputArray.length - 1; i++) {
			if (inputArray[i] >= inputArray[i + 1]) {
				count += (inputArray[i] - (inputArray[i + 1])) + 1;
				inputArray[i + 1] = inputArray[i] + 1;
			}
		}
		return count;
	}

}
