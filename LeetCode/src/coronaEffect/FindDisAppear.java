package coronaEffect;

import java.util.ArrayList;
import java.util.List;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 25, 2020 9:57:18 PM
 */
public class FindDisAppear {
	public static List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> mList = new ArrayList<Integer>();
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
			if (max<nums[i]) {
				max = nums[i];
			}
			mList.add(nums[i]);
		}
        int target = 1;
        ArrayList<Integer> mListA = new ArrayList<Integer>();
        for (int i = 0; i < mList.size(); i++) {
        	if (target<=max) {
        		if (!mList.contains(target)) {
        			mListA.add(target);
    			}
			}
		}
        return mListA;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,3,2,7,8,2,3,1};
		System.err.println(findDisappearedNumbers(nums));
	}

}
