package onetoten;

class SolutionSN {
    public int singleNumber(int[] nums) {
    	int res = 0;
    	for (int i = 0; i < nums.length; i++) {
			res = res ^ nums[i];
		}
        return res;
    }
}
public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SolutionSN sn = new SolutionSN();
		int[] myArray = {5,5,3,4,3};
		System.out.println(sn.singleNumber(myArray));
	}

}
