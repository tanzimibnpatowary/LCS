package sessionapril;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 22, 2020 8:09:54 PM
 */
public class ReformString {
	public static String reformat(String s) {
		StringBuffer forDigit = new StringBuffer();
		StringBuffer forLetter = new StringBuffer();
		for (Character ch : s.toCharArray()) {
			if (ch.isDigit(ch)) {
				forDigit.append(ch);
			}else {
				forLetter.append(ch);
			}
		}
		int lenOfDigit = forDigit.length();
		int lenOfLetter = forLetter.length();
		String start,end;
		if (lenOfDigit>lenOfLetter) {
			start = new String(forDigit);
			end = new String(forLetter);
		}else {
			start = new String(forLetter);
			end = new String(forDigit);
		}
		StringBuffer res = new StringBuffer();
		int st = 0;
		int en = 0;
		boolean flag = false;
		for (int i = 0; i < lenOfDigit+lenOfLetter; i++) {
			if (flag==false) {
				if (st>=start.length()) {
					return "";
				}else {
					res.append(start.charAt(st));
					st++;
				}
			}else {
				if (en>=end.length()) {
					return "";
				}else {
					res.append(end.charAt(en));
					en++;
				}
			}
			flag=!flag;
		}
		return new String(res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "covid2013";
		System.out.println(reformat(s));
		
	}

}
