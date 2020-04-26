package onetoten;
class SolOfCount{
	public String countAndSay(int n) {
		if (n <= 0)
			return null;
		String result = "1";
		int i = 1;
		while (i < n) {
			StringBuilder sb = new StringBuilder();
			int count = 1;
			for (int j = 1; j < result.length(); j++) {
				if (result.charAt(j) == result.charAt(j - 1)) {
					count++;
				} else {
					sb.append(count);
					sb.append(result.charAt(j - 1));
					count = 1;
				}
			}
			sb.append(count);
			sb.append(result.charAt(result.length() - 1));
			result = sb.toString();
			i++;
		}
		return result;
	}
}

public class CountAndSay {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 6;
		SolOfCount mCount = new SolOfCount();
		System.out.println(""+mCount.countAndSay(number));
	}

}
