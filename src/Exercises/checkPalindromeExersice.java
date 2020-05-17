package Exercises;


public class checkPalindromeExersice {

	public static void main(String[] args) {
	System.out.println("Test 1:"+checkPalindrome("aabaa"));//Test 1
	System.out.println("Test 2:"+checkPalindrome("abac"));//Test 2
	System.out.println("Test 3:"+checkPalindrome("a"));//Test 3
	System.out.println("Test 4:"+checkPalindrome("az"));//Test 4
	System.out.println("Test 5:"+checkPalindrome("abacaba"));//Test 5
	System.out.println("Test 6:"+checkPalindrome("z"));//Test 6
	System.out.println("Test 7:"+checkPalindrome("aaabaaa"));//Test 7
	System.out.println("Test 8:"+checkPalindrome("zzzazzazz"));//Test 8
	System.out.println("Test 9:"+checkPalindrome("hlbeeykoqqqqokyeeblh"));//Test 9
	System.out.println("Test 10:"+checkPalindrome("hlbeeykoqqqokyeeblh"));//Test 10		
	}
	public static boolean checkPalindrome(String inputString) {
		//Step 1: Replace vowels with tilde, spaces, point and comma.
		inputString = inputString.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u").replace(" ", "").replace(".", "").replace(",", "");
				String invested = "";
				//Step 2: Iterate from highest to lowest
		        for(int i = inputString.length()-1;i>=0;i--){
		        	//Step 3: Get value position i
		            char c = inputString.charAt(i);
		            //Step 4: Add value in a new String
		            invested = invested+c;
		        }
		        //Step 5: Invested Compare to inputString
		        return invested.equals(inputString);
		}
}


