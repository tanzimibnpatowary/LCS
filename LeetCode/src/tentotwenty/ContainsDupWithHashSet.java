package tentotwenty;

import java.util.Arrays;

public class ContainsDupWithHashSet {
	public static boolean check(int nums[]) {
		if(nums.length==1||nums.length==0)
		    return false;
		Arrays.sort(nums);
		int checkNumber  = nums[0];//
		for (int i = 1; i < nums.length; i++) {
			if (checkNumber == nums[i]) {
				return true;
			}else {
				checkNumber = nums[i];
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] nums = {2,3,6,7,7};
		System.out.println(check(nums));
	}
}
