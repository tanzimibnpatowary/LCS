package another;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 14, 2020 3:31:14 PM
 */
public class ReverseVowels {
	public static String reverseVowels(String s) {
		char[] strs = s.toCharArray();// 3
		int len = strs.length - 1;// hello h
		for (int i = 0; i < strs.length; i++) {
			for (int j = strs.length - 1; j >= 0; j--) {
				if (strs[i] == 'A' || strs[i] == 'E' || strs[i] == 'I' || strs[i] == 'O' || strs[i] == 'U'
						|| strs[i] == 'a' || strs[i] == 'e' || strs[i] == 'i' || strs[i] == 'o' || strs[i] == 'u') {
					char temp = strs[i];
					strs[i] = strs[j];
					strs[j] = temp;
				}
			}
		}
		return strs.toString();
	}

	// leetcode
	// leotcede
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		System.out.println(reverseVowels(s));
		char[] strs = s.toCharArray();
		int coun = 0;
		for (int i = 0; i < strs.length; i++) {
			if (strs[i] == 'a' || strs[i] == 'e' || strs[i] == 'i' || strs[i] == 'o' || strs[i] == 'u') {
//				char temp = strs[i];
//				strs[i] = strs[j];
//				strs[j] = temp;
//				coun++;

			}
		}
		System.out.println(coun);
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
	}

}
