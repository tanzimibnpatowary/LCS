package tentotwenty;

public class RemoveDupSortedA {
	 public static int removeDuplicates(int[] nums) {
		  if (nums.length <= 1) {//112
	            return nums.length;
	        }
	        int toReplace=1;
	        for(int i=1; i< nums.length; i++){
	            if(nums[i] > nums[i-1]){
	                nums[toReplace++] = nums[i];
	            }
	        }
	        return toReplace;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[] = {1,1,2};
		System.out.println(removeDuplicates(number));
	}

}
