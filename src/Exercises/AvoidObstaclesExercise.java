package Exercises;



public class AvoidObstaclesExercise {

	public static void main(String[] args) {
		int[] a = { 1000, 999 };
		System.out.println("Test1: " + avoidObstacles(a));

	}

	static int avoidObstacles(int[] inputArray) {
		int jump = 2;
		for (int j = 0; j < inputArray.length; j++) {
			System.out.println(jump +" == " + inputArray[j]);
			if (inputArray[j] % jump == 0) {
				jump++;
				j = -1;
			}
		}
		System.out.println("respuesta: " + jump);
		return jump;
	}
}
