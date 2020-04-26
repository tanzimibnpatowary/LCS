package tentotwenty;

import java.util.HashSet;

public class ContainsDuplicates {
	public static boolean containsDuplicate(int[] nums) {
		if (nums == null || nums.length == 0) {
			return false;
		}
		HashSet<Integer> mSet = new HashSet<Integer>();
		for (int i : nums) {
			if (mSet.contains(i)) {
				return true;
			}else {
				mSet.add(i);
			}
		}
		return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3};
		System.out.println(containsDuplicate(nums));
	}

}
