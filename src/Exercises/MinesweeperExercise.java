package Exercises;

public class MinesweeperExercise {

	public static void main(String[] args) {
		boolean[][] matrix = {{false,false,false,false}, 
		                      {false,false,false,false}};
		System.out.println("Test1: " + minesweeper(matrix));

	}
	
	static int[][] minesweeper(boolean[][] matrix) {
		int[][] result = new int[matrix.length][matrix[0].length];

		for(int rowm = 0; rowm<matrix.length;rowm++){
		    for(int columnm = 0; columnm<matrix[rowm].length;columnm++){
		        int val = 0;
		        if(rowm -1 >= 0 && columnm - 1 >= 0 && matrix[rowm-1][columnm-1] == true){
		           System.out.println("Entro (-1,-1)");
		        	val++;
		        }
		        if(rowm -1 >= 0 && matrix[rowm-1][columnm] == true){
		        	System.out.println("Entro (-1,0)");
		           val++;
		        }
		        if(columnm -1 >= 0 && matrix[rowm][columnm-1] == true){
		        	System.out.println("Entro (0,-1)");
		           val++;
		        }
		        if(rowm +1 < matrix.length && matrix[rowm + 1][columnm] == true){
		        	System.out.println("Entro (+1,0)");
		           val++;
		        }
		        if(columnm +1 < matrix[rowm].length && matrix[rowm][columnm +1] == true){
		        	System.out.println("Entro (0,+1)");
		           val++;
		        }
		        if(rowm + 1 < matrix.length && columnm +1 < matrix[rowm].length && matrix[rowm+1][columnm +1] == true){
		        	System.out.println("Entro (+1,+1)");
		        	val++;
		        }
		        if(rowm + 1 < matrix.length && columnm -1 >=0 && matrix[rowm+1][columnm-1] == true){
		        	System.out.println("Entro (+1,-1)");
		        	val++;
		        }
		        if(columnm + 1 < matrix[rowm].length && rowm -1 >=0 && matrix[rowm-1][columnm+1] == true){
		        	System.out.println("Entro (-1,+1)");
		        	val++;
		        }
		        result[rowm][columnm] = val;
		        System.out.println("("+rowm + ""+columnm+"): "+val);
		    }
		}

		return result;
		}


}
