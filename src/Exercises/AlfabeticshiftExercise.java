package Exercises;

public class AlfabeticshiftExercise {

	public static void main(String[] args) {
		System.out.println("Test1: " + alphabeticShift("crazy"));//dsbaz
	}
	
	static String alphabeticShift(String inputString) {
		String bar = "";
		for (char c : inputString.toCharArray()) {
		   System.out.println("letra: " + c);
		   System.out.println("(c - 'a'): "+ (c - 'a'));
		   System.out.println("(c - 'a' + 1): "+ (c - 'a' + 1));
		   System.out.println("((c - 'a' + 1)%26): "+ ((c - 'a' + 1)% 26));
		   System.out.println("((c - 'a' + 1)%26)+ 'a'): "+ ((c - 'a' + 1)% 26)+ 'a');
		   bar += Character.toString((char) (((c - 'a' + 1) % 26) + 'a'));
		}
		return bar;
		}

}
