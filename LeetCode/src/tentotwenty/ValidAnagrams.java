package tentotwenty;

import java.util.Arrays;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 11, 2020 5:04:00 PM
 */
public class ValidAnagrams {
	public static boolean isAnagram(String s, String t) {
		char[] s1 = s.toCharArray();
		char[] t2 = t.toCharArray();
		Arrays.sort(s1);
		Arrays.sort(t2);
		return Arrays.equals(s1, t2);
		/*
		 * for (int i = 0; i < s.length(); i++) { counter[s.charAt(i) - 'a']++;
		 * counter[t.charAt(i) - 'a']--; }
		 */
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "anagram";
		String t = "nagaram";
		System.out.println(isAnagram(s, t));
		int[] counter = new int[26];
		for (int i = 0; i < s.length(); i++) {
			counter[s.charAt(i) - 'a']++;
			System.out.println(counter);
			counter[t.charAt(i) - 'a']--;
			System.out.println(counter);
		}

	}

}
