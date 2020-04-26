package onetoten;
class SolutionSqrtX {
    public int mySqrt(int x) {
        int result = (int) Math.sqrt(x);
        //int rev = result;
        return result;
    }
}
public class SqrtX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 69;
		SolutionSqrtX solutionSqrtX = new SolutionSqrtX();
		System.out.println(""+solutionSqrtX.mySqrt(x));
	}

}
