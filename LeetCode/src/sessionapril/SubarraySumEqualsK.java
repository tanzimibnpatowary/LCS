package sessionapril;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 23, 2020 12:08:10 PM
 */
public class SubarraySumEqualsK {
	public static int subarraySum(int[] nums, int k) {
		int sum = 0;
		int firsts = 0;
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			sum+=i;
		}
        return 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,1};
		int k = 2;
		System.out.println(subarraySum(nums, k));
	}

}
