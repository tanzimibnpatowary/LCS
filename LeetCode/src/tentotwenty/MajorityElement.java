package tentotwenty;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 10, 2020 11:06:17 PM
 */
public class MajorityElement {
	public static int majorityElement(int[] nums) {
	
		int sum = nums.length/2;
		
		for (int i : nums) {
			int count = 0;
			for (int j : nums) {
				if (i==j) {
					count= count +1;
				}
			}
			if (count>sum) {
				return i;
			}
		}
		
        return 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] my = {8,8,7,7,7};
		System.out.println(majorityElement(my));
	}

}
