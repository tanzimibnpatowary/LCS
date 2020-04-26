package tentotwenty;

public class RotateArray {
	public static void rotate(int[] nums, int k) {
		int[] firstR = new int[nums.length-k];
		int[] secondR = new int[k];
		int number = 0,number2 = 0;
		for (int i = nums.length-1; i >= nums.length-k; i--) {
			secondR[number] = nums[i];
			number++;
		}
		for (int i = 0; i < secondR.length; i++) {
			System.out.println(secondR[i]);
		}
		//1,2,3,4,5,6,7
		for (int i = nums.length-k-1; i >= 0; i--) {
			firstR[number2] = nums[i];
			number2++;
		}
		for (int i = 0; i < firstR.length; i++) {
			System.out.println(firstR[i]);
		}
		
		
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = {1,2,3,4,5,6,7};
		int k = 3;
		rotate(number, k);
	}

}
