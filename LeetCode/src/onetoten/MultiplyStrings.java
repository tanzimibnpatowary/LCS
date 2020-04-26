package onetoten;

public class MultiplyStrings {
	static public String multiply(String num1, String num2) {
		int number1 = 0;
		for (int i = 0; i < num1.length(); i++) {
		switch (num1) {
		case "0":
			number1 = 0;
			break;
		case "1":
			number1 = 1;
			break;
		case "2":
			number1 = 2;
			break;
		case "3":
			number1 = 3;
			break;
		case "4":
			number1 = 4;
			break;
		case "5":
			number1 = 5;
			break;
		case "6":
			number1 = 6;
			break;
		case "7":
			number1 = 7;
			break;
		case "8":
			number1 = 8;
			break;
		case "9":
			number1 = 9;
			break;
		default:
			break;
		}
		}
		String result = Integer.toString(number1);
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1 = "445";
		String num2 = "3";
		System.out.println(multiply(num1, num2));
	}

}
