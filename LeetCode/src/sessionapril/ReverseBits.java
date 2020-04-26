package sessionapril;

import java.math.BigInteger;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 21, 2020 10:29:14 PM
 */
public class ReverseBits {
	public static int reverseBits(int n) {
		String helloString = String.format("%32s", Integer.toBinaryString(n)).replaceAll(" ", "0");
		char[] binary = helloString.toCharArray();
		String myString = "";
		for (int i = binary.length-1; i >= 0; i--) {
			myString+=binary[i];
		}
		return new BigInteger(myString, 2).intValue();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 43261596;
		System.out.println(reverseBits(n));
	}

}
