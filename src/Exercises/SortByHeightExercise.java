package Exercises;

public class SortByHeightExercise {

	public static void main(String[] args) {
		int[] a = {-1, 150, 190, 170, -1, -1, 160, 180};
		int[] a1 = {-1, -1, -1, -1, -1};
		int[] a2 = {-1};
		int[] a3 = {4, 2, 9, 11, 2, 16};
		int[] a4 = {2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1};
		int[] a5 = {23, 54, -1, 43, 1, -1, -1, 77, -1, -1, -1, 3};
		
		System.out.println("TEST 1: " +sortByHeight(a));
		System.out.println("TEST 2: " +sortByHeight(a1));
		System.out.println("TEST 3: " +sortByHeight(a2));
		System.out.println("TEST 4: " +sortByHeight(a3));
		System.out.println("TEST 5: " +sortByHeight(a4));
		System.out.println("TEST 6: " +sortByHeight(a5));
	}	
	
	public static int[] sortByHeight(int[] a) {
		for (int i = 0; i < a.length-1; i++) {
		    if(a[i] != -1){
		        for (int j = i+1; j < a.length; j++) {
		            if(a[j] != -1 && a[i] > a[j]){             
		                int tmp = a[j];
		                a[j] = a[i];
		                a[i] = tmp;
		            }            
		        }
		    }
		}
		for(int i = 0; i<a.length;i++) {
			System.out.println(a[i]);
		}
		return a;
		}
}
