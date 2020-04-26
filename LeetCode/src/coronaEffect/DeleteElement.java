package coronaEffect;

import java.util.ArrayList;
import java.util.HashSet;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 25, 2020 9:02:23 PM
 */
public class DeleteElement {
	public static int removeElement(int[] nums, int val) {
        ArrayList<Integer> mList = new ArrayList<Integer>();
        for(int i:nums){
            mList.add(i);
        }
   
        for (int i = 0; i < nums.length; i++) {
			if (mList.contains(val)) {
				mList.remove(i);
			}
		}
        return mList.size();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 3, 2, 2, 3 };
		int val = 3;
		//System.out.println(removeElement(nums, val));
		ArrayList<Integer> mList = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
			mList.add(nums[i]);
		}
        System.out.println(mList);
        for (int i = 0; i < mList.size(); i++) {
			if (mList.contains(val)==true) {
				mList.remove(i);
			}
		}
        System.out.println(mList);
	}

}
