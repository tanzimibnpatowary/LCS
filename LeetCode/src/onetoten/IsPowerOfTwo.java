package onetoten;

class SolutionPower {
    public boolean isPowerOfTwo(int n) {
    	int i = 1;
    	while (i<n) {
    		i = 2*i;
		}
    	/*
    	 * memory limit extended
    	int result = 0;
    	int i = 0;
    	boolean hello = false;
    	while (i < n) {
			result = (int) Math.pow(2, i);
			if (n == result) {
				hello = true;
				break;
			}else {
				hello = false;
			}
			i++;
		}
		*/
        return n == i;
    }
}
public class IsPowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 32;
		SolutionPower mPower = new SolutionPower();
		System.out.println(mPower.isPowerOfTwo(number));
	}

}
