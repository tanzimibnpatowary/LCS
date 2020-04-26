package another;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 15, 2020 5:11:35 PM
 */
public class ValidPalindromeII {
	public static boolean validPalindrome(String s) {
		int check = 1;
		s = s.toLowerCase();
		StringBuilder m = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			m = m.append(s.charAt(i));
		}
		StringBuilder go = m;
		for (int k = 0; k < s.length(); k++) {
			m = m.deleteCharAt(k);
			StringBuilder mBuilder = new StringBuilder();
			for (int i = 0; i < s.length(); i++) {
				char he = m.charAt(i);
				if (he >= 'a' && he <= 'z' || he >= '0' && he <= '9') {
					mBuilder.append(he);
				}
			}
			int j = mBuilder.length() - 1;
			int i = 0;
			while (i < j) {
				if (mBuilder.charAt(i) != mBuilder.charAt(j)) {
					check = 0;
				}
				j--;
				i++;
			}
			m = go;
			if (check==1) {
				return true;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aba";
		System.out.println(validPalindrome(s));
	}

}
