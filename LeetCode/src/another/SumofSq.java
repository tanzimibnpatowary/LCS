package another;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 17, 2020 8:43:53 PM
 */
public class SumofSq {
	public static boolean judgeSquareSum(int c) {
		int left = 0;
		int right = (int)Math.sqrt(c);
		while (left<right) {
			int result  = left*left + right*right;
			if (result==c) {
				return true;
			}else if(result<c){
				left++;
			}else {
				right--;
			}
		}
		return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 3;
		System.out.println(judgeSquareSum(c));
		
	}

}
