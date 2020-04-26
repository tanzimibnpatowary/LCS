package another;

import java.util.Arrays;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 18, 2020 6:21:17 PM
 */
public class MergeTwoArray {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1,2,3,0,0,0};
		int m = 3;
		int[] nums2 = {2,5,6};
		int n = 3;
		int j = 0;
		for (int i = 3; i < m+n; i++) {
			nums1[i] = nums2[j];
			j++;
		}
		Arrays.sort(nums1);
		for (int i = 0; i < nums1.length; i++) {
			System.out.println(nums1[i]);
		}
		
	}

}
