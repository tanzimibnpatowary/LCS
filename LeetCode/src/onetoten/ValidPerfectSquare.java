package onetoten;
class SolutionVPS {
    public boolean isPerfectSquare(int num) {
    	float f = 0;
    	int check = 0;
    	f = (float)Math.sqrt(num);
    	check = (int) f;
    	if (check==f) {
			return true;
		}
        return false;
    }
}
public class ValidPerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 25;
		SolutionVPS mSolutionVPS = new SolutionVPS();
		System.out.println(""+mSolutionVPS.isPerfectSquare(x));
	}

}
