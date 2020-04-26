package sessionapril;

import java.math.BigInteger;
import java.util.Arrays;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 23, 2020 8:49:11 PM
 */
public class SortArrayByarity {
	public static int[] sortArrayByParity(int[] A) {
        return A;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {3,1,2,4};
		int a = 0;
		int b = 1;
		System.out.println(a&b);
		System.out.println(sortArrayByParity(A));
		Arrays.sort(A);
		int[] myArr = new int[A.length];
		int count = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i]%2==0) {
				int temp;
				temp = A[count];
				A[count++] = A[i];
				A[i] = temp;
			}
		}
		
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}
	}

}
