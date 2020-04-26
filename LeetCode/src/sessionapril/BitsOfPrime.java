package sessionapril;

import java.math.BigInteger;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 22, 2020 8:34:13 PM
 */
public class BitsOfPrime {
	public static int countPrimeSetBits(int L, int R) {
		int prime = 0;
		for (int i = L; i <R; i++) {
//			int bit = Integer.bitCount(i);
//			BigInteger ch = BigInteger.valueOf(bit);
//			if (ch.isProbablePrime(1)) {
//				prime++;
//			}
			prime += (665772 >> Integer.bitCount(i)) & 1;
		}
        return prime;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int L = 6;
		int R = 10;
		System.out.println(countPrimeSetBits(L, R));
	}

}
