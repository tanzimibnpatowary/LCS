package tentotwenty;

import java.util.Stack;

public class MoveZeroes {
	public static String moveZeroes(int[] nums) {
		Stack<Integer> mStack = new Stack<Integer>();
		StringBuilder mBuilder = new StringBuilder();
		int check = 0; //0,1,0,3,12
        for (int i = 1; i < nums.length; i++) {
			if (check<nums[i]) {
				mStack.push(nums[i]);
			}else {
				
			}
		}
        while (!mStack.isEmpty()) {
        	mBuilder.append(mStack.pop());
		}
        return  mBuilder.reverse().toString();   
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myNums = {0,1,0,3,1};
		System.out.println(moveZeroes(myNums));
	}

}
