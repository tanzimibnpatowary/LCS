package sessionapril;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 25, 2020 3:21:33 PM
 */
public class RansomNote {
	public static boolean canConstruct(String ransomNote, String magazine) {
        int i = 0;
		i =  magazine.indexOf(ransomNote);
		if (i==0) {
			return true;
		}else {
			return false;
		}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ransomNote = "aa";
		String magazine = "ab";
		System.out.println(canConstruct(ransomNote, magazine));
		char[] ran = ransomNote.toCharArray();
		char[] mag = magazine.toCharArray();
		int inc = ran.length;
		int k = 0;
		for (int i = 0; i < mag.length-inc; i++) {
			
		}
	}

}
