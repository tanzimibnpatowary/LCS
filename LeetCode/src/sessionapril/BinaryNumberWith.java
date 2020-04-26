package sessionapril;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 22, 2020 9:12:43 PM
 */
public class BinaryNumberWith {
	public static boolean hasAlternatingBits(int n) {
        String mString = new String(Integer.toBinaryString(n));
        int len = mString.length()-1;
        for (int i = 0; i < len; i++) {
        	char c = mString.charAt(i);
        	char j = mString.charAt(i+1);
			if (c==j) {
				return false;
			}
		}
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 11;
		System.out.println(hasAlternatingBits(n));
		String mString = new String(Integer.toBinaryString(n));
        for (int i = 0; i < mString.length()-1; i++) {
        	char c = mString.charAt(i);
        	char j = mString.charAt(i+1);
			if (c==j) {
				System.out.println("false");
			}
		}
	}

}
