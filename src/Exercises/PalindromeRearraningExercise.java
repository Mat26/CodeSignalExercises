package Exercises;

import java.util.HashMap;
import java.util.Map;

public class PalindromeRearraningExercise {

	public static void main(String[] args) {
		System.out.println("Test1: "+palindromeRearranging("aabb"));//true
	}

	static boolean palindromeRearranging(String inputString) {
		boolean validator = true;
		Map<Character, Integer> numChars = new HashMap<Character, Integer>();
		int count = 0;
		for (int i = 0; i < inputString.length(); ++i) {
			char charAt = inputString.charAt(i);
			if (!numChars.containsKey(charAt)) {
				numChars.put(charAt, 1);
			} else {
				numChars.put(charAt, numChars.get(charAt) + 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : numChars.entrySet()) {
			if (inputString.length() % 2 == 0) {
				if (entry.getValue() % 2 != 0) {
					validator = false;
					break;
				}
			} else {
				if (entry.getValue() % 2 != 0) {
					count++;
					if (count == 2) {
						validator = false;
						break;
					}
				}
			}
		}
		return validator;
	}

}
