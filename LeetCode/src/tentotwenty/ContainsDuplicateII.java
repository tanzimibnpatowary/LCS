package tentotwenty;

import java.util.HashSet;

public class ContainsDuplicateII {
	public static Boolean containsNearbyDuplicate(int[] nums, int k) {
		if (nums == null || nums.length == 0) {
			return false;
		}
		//Again
		 HashSet<Integer> hs = new HashSet<>();
		    for(int i = 0; i < nums.length; i++) {
		        if(i > k) {//1,2,3,1,2,3
		            hs.remove(nums[i-k-1]);
		        }
		        
		        if(!hs.add(nums[i])) {
		        	return true; //1 2 
		        }
		        
		    }
		    return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,1,2,3};
		int k = 8;
		System.out.println(containsNearbyDuplicate(nums, k));
	}

}
