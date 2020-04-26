package onetoten;

public class PlusOne1 {
	public static int[] plusone(int[] digits) {
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = {1,2,3};
		System.out.println(plusone(myArray));
	}

}
