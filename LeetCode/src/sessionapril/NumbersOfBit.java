package sessionapril;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 21, 2020 10:15:38 PM
 */
public class NumbersOfBit {
	public static int hammingWeight(int n) {
		int count = 0;
		while (n!=0) {
			if ((n&1)==1) {
				count++;
			}
			n = n>>1;
		}
		//int m = Integer.bitCount(n);
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 00000000000000000000000000001011;
		System.out.println(hammingWeight(n));
	}

}
