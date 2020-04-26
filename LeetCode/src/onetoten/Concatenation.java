package onetoten;
class MyWork{
	public String name(String str1, String str2) {
		return str1 + str2;
	}
}
public class Concatenation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyWork myWork = new MyWork();
		String first = "Tanzim";
		String second = " Ibn Patowary";
		System.out.println(""+myWork.name(first, second));
		
	}

}
