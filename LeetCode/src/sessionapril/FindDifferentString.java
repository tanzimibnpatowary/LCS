package sessionapril;

import java.util.HashSet;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 25, 2020 2:00:35 PM
 */
public class FindDifferentString {
	public static char findTheDifference(String s, String t) {
		char c = 0;
        for (int i = 0; i < s.length(); i++) {
            c ^= s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            c ^= t.charAt(i);
        }
        return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abscde";
		String t = "abcde";
		System.out.println(findTheDifference(s, t));
		
	}

}
