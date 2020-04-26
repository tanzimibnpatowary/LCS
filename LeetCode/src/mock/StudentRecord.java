package mock;

import java.util.HashSet;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 17, 2020 11:05:11 PM
 */
public class StudentRecord {
	public static boolean checkRecord(String s) {
		if (s.length() == 0) {
			return false;
		}
		char[] arry = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			arry[i] = s.charAt(i);
		}
		int countA = 0;
		int countL = 0;
		int j = 1;
		for (int i = 0; i < arry.length; i++) {
			if (arry[i] == 'A') {
	            countA++;
	            if (countA > 1) {
	                return false;
	            }
	        }
	        if (arry[i] == 'L') {
	        	countL++;
	            if (countL > 2) {
	                return false;
	            }
	        } else {
	        	countL = 0;
	        }
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "PPALLL";
		System.out.println(checkRecord(s));
		

	}

}
