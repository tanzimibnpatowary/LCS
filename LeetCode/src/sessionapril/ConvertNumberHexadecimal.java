package sessionapril;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 22, 2020 10:01:19 PM
 */
public class ConvertNumberHexadecimal {
	public static String toHex(int num) {
		String mString = Integer.toHexString(num);
        return mString;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = -1;
		System.out.println(toHex(num));
	}

}
