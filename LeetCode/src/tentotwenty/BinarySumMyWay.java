package tentotwenty;

public class BinarySumMyWay {
	public static String result(String number1, String number2) {//111 + 11 = 100
		if (number1 == null || number1.length()==0) {
			return number2;
		}
		if (number2 == null || number2.length()==0) {
			return number1;
		}
		StringBuilder sb = new StringBuilder();
		int i = number1.length() - 1;
		int j = number2.length() - 1;
		int carry = 0;//1
		while (i >= 0 || j >= 0 || carry == 1) {
			
			if (i >= 0) {
				carry += number1.charAt(i) - '0';
			}
			
			if (j >= 0) {
				carry += number2.charAt(j) - '0';
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
		System.out.println(result(num1, num2));
	}
}
