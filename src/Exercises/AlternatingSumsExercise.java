package Exercises;

public class AlternatingSumsExercise {

	public static void main(String[] args) {
		int[] a = { 50, 60, 60, 45, 70 };
		System.out.println("Test1: " + alternatingSums(a));// [180, 105]

	}

	static int[] alternatingSums(int[] a) {
		int team1 = 0;
		int team2 = 0;
		int count = 1;
		for (int i = 0; i < a.length; i++) {
			if (count % 2 == 0) {
				team2 += a[i];
			} else {
				team1 += a[i];
			}
			count++;
		}
		int[] result = { team1, team2 };
		return result;
	}

}
