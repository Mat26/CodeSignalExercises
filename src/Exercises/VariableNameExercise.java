package Exercises;

public class VariableNameExercise {

	public static void main(String[] args) {
		System.out.println("Test1: "+ variableName("var_1__Int"));//True

	}

	static boolean variableName(String name) {
		return name.matches("[a-zA-Z_]\\w*");
	}

}
