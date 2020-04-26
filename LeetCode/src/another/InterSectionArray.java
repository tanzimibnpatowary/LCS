package another;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 16, 2020 11:27:19 PM
 */
public class InterSectionArray {
	public int[] intersect(int[] nums1, int[] nums2) {
		int c[] = new int[nums1.length]; 
		int in = 0;
        for (int i = 0; i < nums2.length; i++) {
			for (int j = 0; j < nums1.length; j++) {
				if (nums2[i]==nums1[j]) {
					c[in] = nums2[i];
					in++;
				}
			}
		}
        return c;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1[] = {1,2,2,1};
		int nums2[] = {2,2};
		if (nums1.length<nums2.length) {
			int temp[] = nums1;
			nums1 = nums2;
			nums2 = temp;
		}

        
	}

}
