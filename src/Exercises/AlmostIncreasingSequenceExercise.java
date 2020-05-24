package Exercises;

public class AlmostIncreasingSequenceExercise {

	public static void main(String[] args) {
		int [] a = {1, 3, 2, 1};
		int [] a2 = {1,2,3};
		int [] a3 = {1,2,1,2};
		int [] a4 = {3, 6, 5, 8, 10, 20, 15};
		int [] a5 = {1, 1, 2, 3, 4, 4};
		int [] a6 = {1, 4, 10, 4, 2};
		System.out.println("TEST 1: " + almostIncreasingSequence(a));
		System.out.println("TEST 2: " + almostIncreasingSequence(a2));
		System.out.println("TEST 3: " + almostIncreasingSequence(a3));
		System.out.println("TEST 4: " + almostIncreasingSequence(a4));
		System.out.println("TEST 5: " + almostIncreasingSequence(a5));
		System.out.println("TEST 6: " + almostIncreasingSequence(a6));

	}
	
	static boolean almostIncreasingSequence(int[] sequence) {
		 int error = 0;

		        for(int i = 0; i < sequence.length - 1; i++){
		            if(sequence[i] - sequence[i+1] >= 0){//sequence[i]>=sequence[i+1]
		                error++;
		                if(i - 1 >= 0 && i + 2 <= sequence.length - 1
		                    && sequence[i] - sequence[i+2] >= 0
		                    && sequence[i-1] - sequence[i+1] >= 0){
		                    return false;
		                }
		            }
		        }
		        return error <= 1;
		}

}
