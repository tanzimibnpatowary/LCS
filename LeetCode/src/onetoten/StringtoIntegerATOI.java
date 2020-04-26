package onetoten;

public class StringtoIntegerATOI {
	public static int myAtoi(String str) {
		int number = Integer.parseInt(str);
		
		return number;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myString = "4564 Ta";
		System.out.println(myAtoi(myString));
		}
}
