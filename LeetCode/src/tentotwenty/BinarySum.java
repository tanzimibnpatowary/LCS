package tentotwenty;

public class BinarySum {
	public static String addBinary(String a, String b) {
		if (a == null || a.length() == 0)
			return b;
		if (b == null || b.length() == 0)
			return a;
		StringBuilder sb = new StringBuilder();
		int i = a.length() - 1;
		int j = b.length() - 1;
		int carry = 0;//1
		while (i >= 0 || j >= 0 || carry == 1) {
			
			if (i >= 0) {
				carry += a.charAt(i) - '0';
			}
			
			if (j >= 0) {
				carry += b.charAt(j) - '0';
			}
			
			i--;
			j--;
			
			sb.append((char) (carry % 2 + '0'));
			carry = carry / 2;
		}
		return sb.reverse().toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1 = "11";
		String num2 = "1";
		System.out.println(addBinary(num1, num2));
	}

}
