package tentotwenty;

public class LongestCommonPrefix {
	public static String longestCommonPrefix(String[] strs) {
		String longestCommonPreString = "";
		if (strs == null || strs.length == 0) {
			return longestCommonPreString;
		}
		int index = 0;
		for (char c : strs[0].toCharArray()) {
			for (int i = 1; i < strs.length; i++) {
				if (index >= strs[i].length() || c != strs[i].charAt(index)) {
					return longestCommonPreString;
				}
			}
			longestCommonPreString += c;
			index++;

		}
		return longestCommonPreString;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mString[] = {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(mString));
	}

}
