package sessionapril;

import java.util.HashSet;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 22, 2020 11:23:54 AM
 */
public class FactorialTrailing {
	public static int trailingZeroes(int n) {
		int fac = 1;
		while (n!=0) {
			fac = fac * n;
			n--;
		}
		int count = 0;
		String mString = Integer.toString(fac);
		int temp = 0;
		for (int i = mString.length()-1; i >= temp; i--) {
			char m = mString.charAt(i);
				if (m=='0') {
					count++;
				}else {
					temp = mString.length()-1;
				}
			}
		return fac;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		System.out.println(trailingZeroes(n));
	}

}
