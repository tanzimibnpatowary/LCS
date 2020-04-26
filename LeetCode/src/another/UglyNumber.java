package another;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 17, 2020 9:55:21 PM
 */
public class UglyNumber {
	public static boolean isUgly(int num) {
		if(num <= 0)
            return false;
        
        if(num == 1)
            return true;
        
        boolean mod2 = num%2 == 0, mod3 = num%3 == 0, mod5 = num%5 == 0;
        if(!mod2 && !mod3 && !mod5)
            return false;
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 14;
		System.out.println(isUgly(num));
	}

}
