package coronaEffect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 25, 2020 7:14:51 PM
 */
public class GroupAnagrams {
	public static List<List<String>> groupAnagrams(String[] strs) {
		if (strs == null || strs.length == 0) return new ArrayList<>();
		HashMap<String, List<String>> map = new HashMap<String, List<String>>();
		for (String x : strs) {
			char[] myArray = x.toCharArray();
			Arrays.sort(myArray);
			String string = String.copyValueOf(myArray);
			if (!map.containsKey(string)) {
				map.put(string, new ArrayList<>());
			}
			map.get(string).add(x);
		}
		return new ArrayList<>(map.values());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(groupAnagrams(strs));
	}

}
