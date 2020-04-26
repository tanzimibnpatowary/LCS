package coronaEffect;

import java.util.HashSet;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 26, 2020 8:12:37 PM
 */
public class LongestCommon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "bsbininm";
		String text2 = "jmjkbkjkv";
		if (text1.length()<text2.length()) {
			String temp = text2;
			text2 = text1;
			text1 = temp;
		}
		System.out.println(text2.length());
		System.out.println(text1.length());
		char txt1[] = text1.toCharArray();
		char txt2[] = text2.toCharArray();
		int found = 0;
		int count = 0;
		for (int i = 0; i < txt2.length; i++) {
			for (int j = found; j < txt1.length; j++) {
				if (txt2[i]==txt1[j]) {
					count++;
					found = j+1;
				}
			}
		}
		System.out.println(count);
	}

}
