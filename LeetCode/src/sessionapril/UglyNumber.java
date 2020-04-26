package sessionapril;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 24, 2020 8:42:07 AM
 */
public class UglyNumber {
	public static boolean isUgly(int num) {
		for (int i = 2; i <6; i++) {
			while (num%i==0) {
				num/=i;
			}
		}
        return num==1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		System.out.println(isUgly(n));
	}

}
