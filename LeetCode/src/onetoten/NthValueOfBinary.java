package onetoten;

public class NthValueOfBinary {
	public static void main(String[] args) {
		int number = 15;
		int target = 5;
		target--;
		String con = Integer.toBinaryString(number);
		char[] ch = con.toCharArray();
		System.out.println(""+ch[target]);
	}
}
