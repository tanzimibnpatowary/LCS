package tentotwenty;

import java.util.ArrayList;
import java.util.List;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 12, 2020 5:41:44 PM
 */
public class PowefulInteger {
	public static List<Integer> powerfulIntegers(int x, int y, int bound) {
		List<Integer> ans = new ArrayList<>();
		for (int i = 0; i <= 19 && Math.pow(x, i) <= bound; i++) {
			for (int j = 0; j <= 19 && Math.pow(y, j) <= bound; j++) {
				int d = (int) Math.pow(x, i) + (int) Math.pow(y, j);
				if (d <= bound) {
					if (!ans.contains(d)) // Just check it is already present or not in the list
						ans.add(d);
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2;
		int y = 3;
		int bound = 10;
		System.out.println(powerfulIntegers(x, y, bound));
	}
}
