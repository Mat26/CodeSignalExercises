package Exercises;

import java.util.regex.Pattern;

public class IsIPV4AddressExercise {

	public static void main(String[] args) {
	System.out.println("Test1: " + isIPv4Address("172.16.254.1"));

	}

	static boolean isIPv4Address(String inputString) {
		Pattern PATTERN = Pattern.compile(
				"^((25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])\\.){3}(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])$");
		return PATTERN.matcher(inputString).matches();
	}

}
