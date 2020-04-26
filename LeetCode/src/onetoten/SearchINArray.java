package onetoten;

public class SearchINArray {
	 public static int search(int[] nums, int target) {
		 int position = 0;
	        for (int i = 0; i < nums.length; i++) {
				if (nums[i]==target) {
					position = nums[i];
				}else {
					position = -1;
				}
			}
	        return position;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myArray[] = {4,5,6,7,0,1,2};
		int target = 5;
		System.out.println(search(myArray, target));
	}

}
