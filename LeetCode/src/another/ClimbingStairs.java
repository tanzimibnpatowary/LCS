package another;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 13, 2020 4:25:42 PM
 */
public class ClimbingStairs {
	 public static int climbStairs(int n) {
	        if(n==1){
	            return 1;
	        }
	        int first = 1;
	        int second = 2;
	        for(int i = 3; i<=n; i++){
	            int third = first + second;
	            first = second;
	            second = third;
	        }
	        return second;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		System.out.println(climbStairs(n));
	}

}
