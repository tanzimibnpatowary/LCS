package onetoten;
class SolutionPowerOfthree {
    public boolean isPowerOfTwo(int n) {
    	int i = 1;
    	while (i<n) {
    		i = 3*i;
		}
        return n == i;
    }
}
public class IsPowerOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 45;
		SolutionPowerOfthree mPower = new SolutionPowerOfthree();
		System.out.println(mPower.isPowerOfTwo(number));
	}

}

