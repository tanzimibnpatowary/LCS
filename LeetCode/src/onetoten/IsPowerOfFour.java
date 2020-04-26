package onetoten;
class SolutionPowerOfFour {
    public boolean isPowerOfTwo(int n) {
    	int i = 1;
    	while (i<n) {
    		i = 4*i;
		}
        return n == i;
    }
}
public class IsPowerOfFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 16;
		SolutionPowerOfFour aFour = new SolutionPowerOfFour();
		System.out.println(aFour.isPowerOfTwo(a));
	}

}
