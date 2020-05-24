package Exercises;

import java.util.ArrayList;
import java.util.List;

public class AllLongestStringsExercise {

	public static void main(String[] args) {
		String [] a = {"aba","aa","ad","vcd","aba"};
		String [] a2 = {"aa"};
		String [] a3 = {"abc","eeee","abcd","dcd"};
		String [] a4 = {"a","abc","cbd","zzzzzz","a","abcdef","asasa","aaaaaa"};
		String [] a5 = {"enyky","benyky","yely","varennyky"};
		String [] a6 = {"abacaba","abacab","abac","xxxxxx"};
		String [] a7 = {"young","yooooooung","hot","or","not","come","on","fire","water","watermelon"};
		String [] a8 = {"onsfnib","aokbcwthc","jrfcw"};
		String [] a9 = {"lbgwyqkry"};
		String [] a10 = {"i"};
		System.out.println("TEST 1: " + allLongestStrings(a));
		System.out.println("TEST 2: " + allLongestStrings(a2));
		System.out.println("TEST 3: " + allLongestStrings(a3));
		System.out.println("TEST 4: " + allLongestStrings(a4));
		System.out.println("TEST 5: " + allLongestStrings(a5));
		System.out.println("TEST 6: " + allLongestStrings(a6));
		System.out.println("TEST 7: " + allLongestStrings(a7));
		System.out.println("TEST 8: " + allLongestStrings(a8));
		System.out.println("TEST 9: " + allLongestStrings(a9));
		System.out.println("TEST 10: " + allLongestStrings(a10));

	}
	public static String[] allLongestStrings(String[] inputArray) {
		List<String> longes = new ArrayList<String>();
		int max = inputArray[0].length();
		for(int i = 1; i<inputArray.length;i++){
		    if(max < inputArray[i].length()){
		        max = inputArray[i].length();
		    }    
		}
		for(int i = 0; i < inputArray.length; i++){
		    if(inputArray[i].length() == max){
		        longes.add(inputArray[i]);
		    }
		}
		return longes.toArray(new String[0]);
		}

}
