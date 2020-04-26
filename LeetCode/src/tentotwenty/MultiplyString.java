package tentotwenty;

public class MultiplyString {
	public static String multiply(String num1, String num2) {
		int first = Integer.parseInt(num1);
		int second = Integer.parseInt(num2);
		StringBuilder mBuilder = new StringBuilder();
		return mBuilder.append(first*second).toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1 = "2";
		String num2 = "3";
		System.out.println(multiply(num1, num2));
	}

}
