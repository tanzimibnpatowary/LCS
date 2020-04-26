package tentotwenty;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
				map.put('I', 1);
				map.put('V', 5);
				map.put('X', 10);
				map.put('L', 50);
				map.put('C', 100);
				map.put('D', 500);
				map.put('M', 1000);

		if (s == null || s.length() == 0)
			return 0;
		//M C M X C I V
		//0 1 2 3 4 5 6
		char[] values = s.toCharArray();
		int result = map.get(values[0]);

		for (int i = 1; i < values.length; i++) {

			int prev = map.get(values[i - 1]);
			int cur = map.get(values[i]);

			if (cur > prev) {
				result = result - prev + (cur - prev);
			} else {
				result = result + cur;
			}

		}

		return result;
	    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myString = "MCMXCIV";
		System.out.println(romanToInt(myString));
	}

}
