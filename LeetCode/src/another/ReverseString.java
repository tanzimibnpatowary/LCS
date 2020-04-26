package another;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 14, 2020 3:13:19 PM
 */
public class ReverseString {
	public void reverseString(char[] s) {
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] s = {'h','e','l','l','o'};
		int len = s.length-1;
		for (int i = 0; i < s.length/2; i++) {
			char temp = s[i];
			s[i] = s[len];
			s[len] = temp;
			len--;
		}
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}

}
