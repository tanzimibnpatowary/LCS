package onetoten;

public class SearchInsertPosition {
	static public int searchInsert(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= target) {
				return  i;
			}
		}
        return nums.length;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[] = {1,3,5,6};
		int check = 8;
		System.out.println(searchInsert(number, check));
	}

}
