package Exercises;

public class ShapeAreaExercise {

	public static void main(String[] args) {
		System.out.println("TEST 1: "+ shapeArea(2));
		System.out.println("TEST 2: "+ shapeArea(3));
		System.out.println("TEST 3: "+ shapeArea(1));
		System.out.println("TEST 4: "+ shapeArea(5));
		System.out.println("TEST 5: "+ shapeArea(7000));

	}

	static int shapeArea(int n) {
		int a = (n - 1);
		int sumatoria = 0;
		for (int i = 0; i <= a; i++) {
			sumatoria = i + sumatoria;
		}
		return (4 * sumatoria) + 1;
	}

}
