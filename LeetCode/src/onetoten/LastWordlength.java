package onetoten;
class Solution{
	public int lengthofLast(String s) {
		int len = 0;
		String x = s.trim();
		for (int i = 0; i < x.length(); i++) {
			if (x.charAt(i) == ' ') {
				len = 0;
			}else {
				len++;
			}
		}
		return len;
	}
}
public class LastWordlength {
	public static void main(String[] args) {
		Solution so = new Solution();
		String s = "Tanzim Hello";
		//System.out.println("No\n"+s.trim());
		int target = so.lengthofLast(s);
		System.out.println(""+target);
	}
}
