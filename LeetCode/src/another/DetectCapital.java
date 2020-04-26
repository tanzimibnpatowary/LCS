package another;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 20, 2020 12:05:52 PM
 */
public class DetectCapital {
	public static boolean detectCapitalUse(String word) {
		if (word==null) {
			return false;
		}
		return word.matches("[A-Z]*|.[a-z]*");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "g";
		System.out.println(detectCapitalUse(s));
	}

}
