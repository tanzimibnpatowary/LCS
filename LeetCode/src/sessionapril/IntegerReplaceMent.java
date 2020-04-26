package sessionapril;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 22, 2020 9:27:30 PM
 */
public class IntegerReplaceMent {
	public static int integerReplacement(int n) {
		if(n==1) {
			return 0;
		}
		else if(n%2==0) {
			return 1+integerReplacement(n/2);
		}
		else {
			return 2+Math.min(integerReplacement((n/2)+1), integerReplacement(n/2));
		}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 65535;
		System.out.println(integerReplacement(n));
		if(n==1) {
			System.out.println(0);
		}
		else if(n%2==0) {
			System.out.println(1+integerReplacement(n/2));
		}
		else {
			System.out.println(2+Math.min(integerReplacement((n/2)+1), integerReplacement(n/2)));
		}
		
	}

}
