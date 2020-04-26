package tentotwenty;

public class RomanToIntII {
	public static int check(String s) {
		int[] div = {1000, 900, 500, 400, 100, 90, 
                50, 40, 10, 9, 5, 4, 1};
		String[] roman = {"M", "CM", "D", "CD", "C", "XC", 
                     "L", "XL", "X", "IX", "V", "IV", "I"};
		
		for (int i = 0; i < roman.length; i++) {
			//char a = s.charAt(i);
			
		}
		return 0;
	}
	public static void main(String[] args) {
		String myString = "MCMXCIV";
		System.out.println(check(myString));
	}
}
