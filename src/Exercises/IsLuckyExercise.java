package Exercises;

public class IsLuckyExercise {

	public static void main(String[] args) {
		System.out.println("TEST 1: "+ isLucky(1230));
		System.out.println("TEST 2: "+ isLucky(239017));
		System.out.println("TEST 3: "+ isLucky(134008));
		System.out.println("TEST 4: "+ isLucky(10));
		System.out.println("TEST 5: "+ isLucky(11));
		System.out.println("TEST 6: "+ isLucky(1010));
		System.out.println("TEST 7: "+ isLucky(261534));
		System.out.println("TEST 8: "+ isLucky(100000));
		System.out.println("TEST 9: "+ isLucky(999999));
		System.out.println("TEST 10: "+ isLucky(123321));		
	}
	
	
	public static boolean isLucky(int n) {
		String ticket = n + "";
		int mitad = ticket.length()/2;
		System.out.println("Mitad = "+mitad);
		int left = 0,right = 0;
		for(int i = 0;i<ticket.length();i++){
			System.out.println("Si es"+i);
		    if(i<mitad){
		    	System.out.println("Entro Left:");
		        left+=Integer.parseInt(Character.toString(ticket.charAt(i)));
		        System.out.println(left);
		    }else{
		    	System.out.println("Entro right:");
		        right+=Integer.parseInt(Character.toString(ticket.charAt(i)));
		        System.out.println(right);
		    }
		}
		System.out.println("left:"+left+" right: "+right);
		return left == right;
		}

}
