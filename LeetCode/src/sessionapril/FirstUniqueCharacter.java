package sessionapril;

import java.util.HashSet;
import java.util.Stack;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 22, 2020 11:03:05 PM
 */
public class FirstUniqueCharacter {
	public static String firstUniqChar(String s) {
		char[] mych = s.toCharArray();
		int[] myN = new int[26];
		for (int i = 0; i < mych.length; i++) {
			
		}
		return "";
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "loveleetcode";
		System.out.println(firstUniqChar(s));
		char[] mych = s.toCharArray();
		int tec = 122-97;
		int[] myN = new int[256];
		for (int i = 97; i <=122; i++) {
			myN[mych[i]]+=1;
		}
		for (int i = 0; i < myN.length; i++) {
			System.out.println(myN[i]);
		}
	}

}
