package another;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 16, 2020 9:52:42 PM
 */
public class AddStrings {
	public static String addStrings(String num1, String num2) {
		int n1 = 0;
		for (int i = 0; i < num1.length(); i++) {
			char n = num1.charAt(i);
			n1 = n;
		}
		return "";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1 = "646";
		String num2 = "446";
		
		System.out.println(addStrings(num1, num2));
		int sum = 0;
		int n1 = 0;
		for (int i = num1.length()-1; i >=0; i--) {
			for (int j = i; j >= 0; j--) {
				//sum = String.num1[i].+num2[j];
			}
		}
		System.out.println(n1);
	}

}
