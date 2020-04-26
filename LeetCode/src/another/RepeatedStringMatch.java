package another;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 12, 2020 9:55:58 PM
 */
public class RepeatedStringMatch {
	public static int repeatedStringMatch(String A, String B) {
		int count = 0;
		while (0>A.indexOf(B)) {
			A = A+A;
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = "abcdabcd";
		String B = "cdabcdab";
		System.out.println(repeatedStringMatch(A, B));
		
	}

}
