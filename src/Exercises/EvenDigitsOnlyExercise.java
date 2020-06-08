package Exercises;

public class EvenDigitsOnlyExercise {

	public static void main(String[] args) {
		System.out.println("Test1: "+evenDigitsOnly(246822));//True

	}

	static boolean evenDigitsOnly(int n) {
		boolean even = true;
		String m = Integer.toString(n);
		for (int i = 0; i < m.length(); i++) {
			if (m.charAt(i) % 2 != 0) {
				even = false;
				break;
			}
		}
		return even;
	}

}
