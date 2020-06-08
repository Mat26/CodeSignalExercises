package Exercises;

public class AreEquallyStrongExercise {

	public static void main(String[] args) {
		System.out.println("Test1: " + areEquallyStrong(10, 15, 15, 10));// true

	}

	static boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
		return (yourLeft == friendsLeft && yourRight == friendsRight)
				|| (yourRight == friendsLeft && yourLeft == friendsRight) ? true : false;
	}

}
