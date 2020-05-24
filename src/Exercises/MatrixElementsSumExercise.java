package Exercises;

public class MatrixElementsSumExercise {

	public static void main(String[] args) {
		int[][] a = {{0,1,1,2},{0,5,0,0},{2,0,3,3}};
		int[][] a2 = {{1,1,1,0},{0,5,0,1},{2,1,3,10}};
		int[][] a3 = {{1,1,1},{2,2,2},{3,3,3}};
		int[][] a4 = {{0}};
		int[][] a5 = {{1,0,3},{0,2,1},{1,2,0}};
		int[][] a6 = {{1},{5},{0},{2}};
		int[][] a7 = {{1,2,3,4,5}};
		int[][] a8 = {{2},{5},{10}};
		int[][] a9 = {{4,0,1},{10,7,0},{0,0,0},{9,1,2}};
		int[][] a10 = {{1}};
		System.out.println("TEST 1: " + matrixElementsSum(a));
		System.out.println("TEST 2: " + matrixElementsSum(a2));
		System.out.println("TEST 3: " + matrixElementsSum(a3));
		System.out.println("TEST 4: " + matrixElementsSum(a4));
		System.out.println("TEST 5: " + matrixElementsSum(a5));
		System.out.println("TEST 6: " + matrixElementsSum(a6));
		System.out.println("TEST 7: " + matrixElementsSum(a7));
		System.out.println("TEST 8: " + matrixElementsSum(a8));
		System.out.println("TEST 9: " + matrixElementsSum(a9));
		System.out.println("TEST 10: " + matrixElementsSum(a10));

	}
	
	static int matrixElementsSum(int[][] matrix) {
		int total = 0;
		int haunted [] = new int[matrix[0].length];
		for(int i = 0; i<haunted.length;i++){
		    haunted[i]=1;
		}
		for(int row = 0;row<matrix.length;row++){
		    for(int column = 0; column<matrix[row].length;column++){
		     if(matrix[row][column] != 0 && haunted[column]!=0){
		        total = total + matrix[row][column];
		     }else{
		      haunted[column]=0;
		     }
		    }
		}

		return total;
		}

}
