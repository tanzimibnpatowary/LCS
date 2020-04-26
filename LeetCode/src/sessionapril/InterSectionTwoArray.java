package sessionapril;

import java.util.Arrays;
import java.util.HashSet;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 23, 2020 12:21:47 PM
 */
public class InterSectionTwoArray {
	public static int[] intersection(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		return nums1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		//System.out.println(intersection(nums1, nums2));
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		if (nums1.length>nums2.length) {
			int[] temp = nums2;
			nums2 = nums1;
			nums1 = temp;
		}
		HashSet<Integer> mSet1 = new HashSet<Integer>();
		HashSet<Integer> mSet2 = new HashSet<Integer>();
		for (Integer i : nums2) {
			mSet1.add(i);
		}
		for (Integer x: nums1) {
			if (mSet1.contains(x)) {
				mSet2.add(x);
			}
		}
		int[] r = new int[mSet2.size()];
		int index = 0;
		for (Integer g: mSet2) {
			r[index] = g;
			index++;
		}
	}

}
