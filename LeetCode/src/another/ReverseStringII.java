package another;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 14, 2020 4:36:09 PM
 */
public class ReverseStringII {
	public static String reverseStr(String s, int k) {
		char[] string = s.toCharArray();
		for (int i = k-1; i < string.length; i=i+k-1) {
			char temp = string[i];
			string[i] = string[i-1];
			string[i-1] = temp;
		}
		return string.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcdefg";
		int k = 2;
		System.out.println(reverseStr(s, k));
		char[] string = s.toCharArray();
		for (int i = k-1; i < string.length; i=i+k) {
			char temp = string[i];
			string[i] = string[i-1];
			string[i-1] = temp;
		}
		for (int i = 0; i < string.length; i++) {
			System.out.println(string[i]);
		}
	}

}
