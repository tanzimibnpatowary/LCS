package sessionapril;

import java.math.BigInteger;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 22, 2020 6:33:14 PM
 */
public class GetSum {
	public static int getSum(int a, int b) {
		BigInteger bigA = BigInteger.valueOf(a);
		BigInteger bigB = BigInteger.valueOf(b);
		BigInteger sum = bigA.add(bigB);
		Integer s = sum.intValue();
		return s;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 6;
		System.out.println(getSum(a, b));
		while(b!=0){
			int c=a&b;
			a=a^b;
			b=c<<1;
		}
		System.out.println(a);
		System.out.println(a|b);
	}

}
