package sessionapril;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 24, 2020 10:03:01 AM
 */
public class Maximum69 {
	public static int maximum69Number(int num) {
		int size = String.valueOf(num).length();
		int n[] = new int[size];
		int c = 0;
		while (num != 0) {
			n[c] = num % 10;
			c++;
			num = num / 10;
		}
		for (int i = n.length - 1; i >= 0; i--) {
			if (n[i] == 6) {
				n[i] = 9;
				break;
			}
		}
		int res = 0;
		for (int i = 0; i < size; i++) {
			res += n[i] * Math.pow(10, i);
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 9669;
		System.out.println(maximum69Number(num));

	}

}
