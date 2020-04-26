package onetoten;

public class PerfectSquare {
	public static boolean chek(int num) {
		int count = 0;
		for (int i = 1; i < num; i++) {
			if (i*i==num) {
				count = 1;
			}
		}
		if (count==1) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 6;
		System.out.println(chek(num));
	}

}
