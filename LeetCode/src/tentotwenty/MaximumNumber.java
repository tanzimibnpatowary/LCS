package tentotwenty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 12, 2020 12:41:08 PM
 */
public class MaximumNumber {
	public static int maxNumberOfBalloons(String text) {
		char[] ballon = { 'b', 'a', 'l', 'l', 'o', 'o', 'n' };
		ArrayList<Character> a = new ArrayList<Character>();
		for (int i = 0; i < text.length(); i++) {
			a.add(text.charAt(i));
		}
		String result = "";
		int count = 0;
		int i = 0;
		while (i != 7) {
			for (int j = 0; j < a.size(); j++) {
				if (ballon[i] == a.get(j)) {
					result = result + a.get(j);
					a.remove(j);
					break;
				}

			}
			i++;
			if (result.equals("balloon")) {
				count++;
				i = 0;
				result = "";
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "nlaebolko";
		System.out.println(maxNumberOfBalloons(text));

	}

}
