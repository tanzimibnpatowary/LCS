package another;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 13, 2020 10:25:50 PM
 */
public class ValidPalindrome {
	public static boolean isPalindrome(String s) {
		//String mString = s.toLowerCase().replaceAll("[^a-z0-9]", "");
		s = s.toLowerCase();
		StringBuilder mBuilder = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			 char he = s.charAt(i);
			 if (he>='a'&&he<='z'||he>='0'&&he<='9') {
				mBuilder.append(he);
			}
		}
		int j = mBuilder.length()-1;
		int i = 0;
		while(i < j) {
			if (mBuilder.charAt(i)!=mBuilder.charAt(j)) {
				return false;
			}
			j--;
			i++;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));
		StringBuilder mString = new StringBuilder();
		mString.append((s.toLowerCase().replaceAll("[^a-z0-9]", "")));
		StringBuilder mString1 = new StringBuilder();
		mString1 = mString.reverse();
		System.out.println(mString1);
		System.out.println(mString);

	}

}
