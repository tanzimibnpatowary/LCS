package onetoten;

public class PlusOne {
	/*
	public static int[] plusOne(int[] digits) {
		
		int i = digits.length-1;
        
        while (i >= 0 && digits[i] == 9) { //loop until not digits[i] != 9 or end of array
            digits[i] = 0;            
            i--;
        }
        if (i == -1) { //end of array reached
            int[] sol = new int[digits.length+1];
            sol[0] = 1;
            return sol;
        }
        else {
            digits[i]++;
            return digits;
        } 
        
    }
    */
	public static void main(String[] args) {
		int[] digits = {1,2,3};
		for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                System.out.println(digits[i]);
            } else {
                digits[i] = 0;
				// simulate a "carry" by continuing the loop
            }
        }

        // Code reaches here for inputs of all 9s such as [9, 9, 9]
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        for (int i = 0; i < result.length; i++) {
        	System.out.println(result[i]);
		}
        
		//System.out.println(PlusOne.plusOne(myArray));
	}
}
