package sessionapril;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 21, 2020 7:46:03 PM
 */
public class RotateArray {
	public static void rotate(int[] nums, int k) {
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4,5,6,7};
		//			 7  6 4 
		int k = 3;
		for (int i = 0; i < k; i++) {
			int pre = nums[nums.length-1]; //6
			for (int j = 0; j < nums.length; j++) {
				int temp = nums[j];
				nums[j] = pre;
				pre = temp;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

}
