package another;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 15, 2020 5:39:24 PM
 */
public class CheckIfN {
	public static boolean checkIfExist(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (0 <= arr[i]&&arr[i] != arr[j]) {
					int posi = arr[j] * 2;
					if (posi>=0) {
						if (arr[i] == posi) {
							return true;
						}
					}
					
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { -10, 12, -20, -8, 15 };
		System.out.println(checkIfExist(arr));
	}

}
