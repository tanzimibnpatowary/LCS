package sessionapril;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 21, 2020 3:54:24 PM
 */
public class ExcelColumnTitile {
	 public static int titleToNumber(String s) {
	        int result = 0;
	        for(int i = 0; i<s.length(); ++i){
	            char c = s.charAt(i);
	            result = result * 26 + (c-'A'+1);
	        }
	        return result;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ZAAAA";
		System.out.println(titleToNumber(s));
		int result = 0;
        for(int i = 0; i<s.length(); ++i){
            char c = s.charAt(i);
            result = result * 26 + (c-'A'+1);
        }
	}

}
