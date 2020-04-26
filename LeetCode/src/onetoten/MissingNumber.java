package onetoten;
class SolutionMN {
    public int missingNumber(int[] nums) {
    	int ex = 0;
    	int re = 0;
    	for (int index = 0; index <= nums.length; index++) {
			ex = ex + index;
		}
    	for (int index = 0; index < nums.length; index++) {
			ex = ex + nums[index];
		}
    	return ex - re;
    }
}
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,0,1};
		SolutionMN mn = new SolutionMN();
		System.out.println(mn.missingNumber(nums));
	}

}
