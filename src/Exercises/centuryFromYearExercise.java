package Exercises;

public class centuryFromYearExercise {
	public static void main(String[] args) {
		System.out.println("Test 1:"+centuryFromYear(1905));//Test 1
		System.out.println("Test 2:"+centuryFromYear(1700));//Test 2
		System.out.println("Test 3:"+centuryFromYear(1988));//Test 3
		System.out.println("Test 4:"+centuryFromYear(2000));//Test 4
		System.out.println("Test 5:"+centuryFromYear(2001));//Test 5
		System.out.println("Test 6:"+centuryFromYear(200));//Test 6
		System.out.println("Test 7:"+centuryFromYear(374));//Test 7
		System.out.println("Test 8:"+centuryFromYear(45));//Test 8
		System.out.println("Test 9:"+centuryFromYear(8));//Test 9	
		}
	
	public static int centuryFromYear(int year) {
		//Just one Step: year Module 100 - It's greater than or equal to 1?
		//Yes - Year divided to 100 plus 1
		//No - Year divided to 100
		//Example: 1905%100 = 5 then 5 >= 1 yes 1905/100 = 20	
		//Example 2: 2000%100 = 0 then 0 >=1 no (2000/100)+1 = 21
		return (year%100>=1)?(year/100)+1:year/100;
		}
}
