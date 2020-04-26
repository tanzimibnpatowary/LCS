package another;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 12, 2020 8:55:20 PM
 */
public class RepeatedSubstring {
	public static boolean repeatedSubstringPattern(String s) {
		int idx = (s + s).indexOf(s, 1);
        return  idx < s.length();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcabcabcabc";
		System.out.println(repeatedSubstringPattern(s));
		System.out.println((s + s).indexOf(s, 1));
		//abcabcabcabc abcabcabcabc
	}

}
