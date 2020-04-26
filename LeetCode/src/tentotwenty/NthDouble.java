package tentotwenty;

import java.util.Stack;

public class NthDouble {
	public static int checkIfExist(int[] arr) {
		int check  = arr[0];
		int big = 0;
		Stack<Integer> mStack = new Stack<Integer>();
        for (int i = 0; i < arr.length; i++) {
			if (mStack.isEmpty()) {
				mStack.push(arr[i]);
			}
			if (mStack.peek()==arr[i]*2) {
				big = arr[i];
				mStack.pop();
			}
			else {
				mStack.push(arr[i]);
			}
		}
        return big;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] my = {10,2,5,3};
		System.out.println(checkIfExist(my));
	}

}
