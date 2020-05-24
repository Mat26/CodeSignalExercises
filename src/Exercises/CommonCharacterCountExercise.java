package Exercises;

public class CommonCharacterCountExercise {

	public static void main(String[] args) {
		System.out.println("TEST 1: " + commonCharacterCount("aabcc", "adcaa"));
		System.out.println("TEST 1: " + commonCharacterCount("zzzz", "zzzzzzz"));
		System.out.println("TEST 1: " + commonCharacterCount("abca", "xyzbac"));
		System.out.println("TEST 1: " + commonCharacterCount("a", "b"));
		System.out.println("TEST 1: " + commonCharacterCount("a", "aaa"));

	}
	
	public static int commonCharacterCount(String s1, String s2) {
		int common = 0;
		for(int value1 = 0; value1 < s1.length(); value1++){
		    for(int value2 = 0; value2 < s2.length(); value2++){
		    	System.out.println(s1.charAt(value1) + " Es igual a "+s2.charAt(value2));
		        if(s1.charAt(value1) == s2.charAt(value2)){
		            common++;
		            System.out.println("Si son iguales, numero de comunes: "+common);
		            s2 = s2.replaceFirst(s2.charAt(value2)+"", "");
		            System.out.println("Cadena dos queda igual a: "+s2);
		            break;
		        }
		    }
		}
		return common;
		}

}
