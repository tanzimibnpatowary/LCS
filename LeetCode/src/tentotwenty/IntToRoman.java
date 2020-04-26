package tentotwenty;
//1994
public class IntToRoman {//// M = 1000, CM = 900, XC = 90 and IV = 4.
	public static String intToRoman(int num) { 
		StringBuilder mBuilder = new StringBuilder();
		int[] div = {1000, 900, 500, 400, 100, 90, 
                50, 40, 10, 9, 5, 4, 1};
		String[] roman = {"M", "CM", "D", "CD", "C", "XC", 
                     "L", "XL", "X", "IX", "V", "IV", "I"};
        for (int i = 0; i < div.length;) {
			if (num>=div[i]) {
				mBuilder.append(roman[i]);
				num = num - div[i];
			}else {
				i++;
			}
		}
		return mBuilder.toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 3;
		System.out.println(intToRoman(number));
	}

}
