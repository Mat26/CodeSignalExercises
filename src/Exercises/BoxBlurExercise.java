package Exercises;

public class BoxBlurExercise {

	public static void main(String[] args) {
		int[][]image= {{7,4,0,1},
				       {5,6,2,2},
				       {6,10,7,8},
				       {1,4,2,0}};
       System.out.println("Test1: " + boxBlur(image)); 
	}
	
	static int[][] boxBlur(int[][] image) {
		int total = 0;
		int x = 0;
		int y = 0;
		int res[][] = new int[image.length - 2][image[0].length - 2];
		for(int row = 0; row<res.length;row++){
		    for(int column = 0; column<res[row].length;column++){
		        for(int rowim = 0;rowim<image.length;rowim++){
		            for(int columnin = 0;columnin<image[rowim].length;columnin++){
		             	if(columnin+y<3+y) {
		             		total+= image[rowim+x][columnin+y];
		             		System.out.println(total);
		             	}else {
		             		break;
		             	}
		            }
		            if(rowim+x==2+x) {
		            	break;
		            }
		        }
		        res[row][column]=total/9;
		        y++;
		        total=0;
		    }
		    x++;
		    y=0;
		}
		return res;
		}

}
