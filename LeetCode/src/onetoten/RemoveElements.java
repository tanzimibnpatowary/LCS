package onetoten;

public class RemoveElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[] {3,2,2,3};
		int var = 3;
		int k = 0;
		for (int i = 0; i < num.length; i++) {
			if (var != num[i]) {
				num[k]=num[i];
				k++;
			}
		}
		System.out.println(k);
	}

}
