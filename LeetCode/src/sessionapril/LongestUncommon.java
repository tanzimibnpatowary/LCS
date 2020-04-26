package sessionapril;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 23, 2020 9:58:34 AM
 */
public class LongestUncommon {
	public static int findLUSlength(String a, String b) {
		// abd //aa
		String temp = "";
		
		if (a.length() < b.length()) {
			return b.length();
		}
		if (a.length() > b.length()) {
			return a.length();
		}
		int count = 0;
		int j = 0;
		char aa[] = a.toCharArray();
		char bb[] = b.toCharArray();
		for (int i = 0; i < a.length(); i++) {
			if(aa[i]!=bb[j]) {
				count = a.length();
			}
			j++;
		}
		if (count==0) {
			return -1;
		}else {
			return count;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "aba";
		String b = "cdc";
		System.out.println(findLUSlength(a, b));
	}

}
