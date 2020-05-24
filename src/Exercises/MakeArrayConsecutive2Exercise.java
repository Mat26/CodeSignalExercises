package Exercises;

import java.util.Arrays;

public class MakeArrayConsecutive2Exercise {

	public static void main(String[] args) {
		int [] a = {6, 2, 3, 8};
		int [] a2 = {0,3};
		int [] a3 = {5,4,6};
		int [] a4 = {6,3};
		int [] a5 = {1};
		System.out.println("TEST 1:" + makeArrayConsecutive2(a));
		System.out.println("TEST 2:" + makeArrayConsecutive2(a2));
		System.out.println("TEST 3:" + makeArrayConsecutive2(a3));
		System.out.println("TEST 4:" + makeArrayConsecutive2(a4));
		System.out.println("TEST 5:" + makeArrayConsecutive2(a5));
	}
	
	static int makeArrayConsecutive2(int[] statues) {
		int total = 0;
				Arrays.sort(statues);
				for(int i=0;i<(statues.length)-1;i++){			
					   if((statues[i+1]-statues[i])>1){
					      total = ((statues[i+1]-statues[i])-1) + total;
					   }
					}
		return total;
		}

}
