package another;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 13, 2020 4:48:28 PM
 */
public class ClimbingStairsApprochAnother {
	public static int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        int[] my = new int[n+1];
        my[1] = 1;
        my[2] = 2;
        for (int i = 3; i <= n; i++) {
			my[i] = my[i-1]+my[i-2];
		}
        return my[n];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		System.out.println(climbStairs(n));
	}

}
