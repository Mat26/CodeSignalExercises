package Exercises;

public class ReverseInParenthesesExercise {

	public static void main(String[] args) {
		System.out.println("Test 1: " + reverseParentheses("(bar)"));
		System.out.println("Test 2: " + reverseParentheses("foo(bar)baz"));
		System.out.println("Test 3: " + reverseParentheses("foo(bar)baz(blim)"));
		System.out.println("Test 4: " + reverseParentheses("foo(bar(baz))blim"));
		System.out.println("Test 5: " + reverseParentheses(""));
		System.out.println("Test 6: " + reverseParentheses("()"));
		System.out.println("Test 7: " + reverseParentheses("(abc)d(efg)"));
	}
	
	
	public static String reverseParentheses(String s){
        for(int i = 0; i < s.length(); i++) {
            if(s.toCharArray()[i] == ')') {
            	System.out.println("valor subString(0,i): "+s.substring(0, i) + " VAlor subString(i+1): "+s.substring(i + 1));
                s = s.substring(0, i) + s.substring(i + 1);
                System.out.println("valor s:" + s);
                i--;
                String reversed = "";
                while(s.toCharArray()[i] != '(') {
                    reversed += s.toCharArray()[i];
                    System.out.println("reversed: "+reversed);
                    System.out.println("subString(0,i): "+s.substring(0, i) + " subString(i+1): "+s.substring(i + 1));
                    s = s.substring(0, i) + s.substring(i + 1);                    
                    i --;
                }
                s = s.substring(0, i) + reversed + s.substring(i + 1);
                System.out.println("valor s:" + s);
                i += reversed.length() - 1;
            }
        }
        System.out.println("resultado: "+s);
        return s;
    }

}
