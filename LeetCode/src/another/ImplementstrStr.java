package another;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 12, 2020 8:46:36 PM
 */
public class ImplementstrStr {
	public static int strStr(String haystack, String needle) {
		return haystack.indexOf(needle);  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String haystack  = "aaaaa";
		String needle  = "bba";
		System.out.println(strStr(haystack, needle));
	}

}
