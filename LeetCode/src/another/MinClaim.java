package another;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 13, 2020 5:10:29 PM
 */
public class MinClaim {
	public static int minCostClimbingStairs(int[] cost) {//10, 15, 20
		int first  = cost[0];//1
		int second  = cost[1];//100
		for (int i = 2; i < cost.length; i++) {
			int rev = cost[i]+Math.min(first, second);//1
			first = second;//2
			second = rev;//1
		}//1, 100, 1, 1, 1, 100, 1, 1, 100, 1
        return Math.min(first, second);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cost[] = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
		System.out.println(minCostClimbingStairs(cost));
	}

}
