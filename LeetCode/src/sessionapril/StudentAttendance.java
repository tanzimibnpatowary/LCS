package sessionapril;

import java.util.HashSet;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 23, 2020 10:20:09 AM
 */
public class StudentAttendance {
	public static boolean checkRecord(String s) {
		char[] mych = s.toCharArray();
		char first = '\0';
		char second = '\0';
		int count = 0;
		for (int i = 0; i < mych.length; i++) {
			if (mych[i] == 'A') {
				count++;
			}
			if (mych[i] == 'L' && first == 'L' && second == 'L') {
				return false;
			}
			if (count > 1) {
				return false;
			}
			second = first;
			first = mych[i];
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "LLL";
		System.out.println(checkRecord(s));

	}

}
