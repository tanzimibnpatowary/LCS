package coronaEffect;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 25, 2020 9:34:37 PM
 */
public class DuplicateZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,2,3,0,4,5,0};
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==0) {
				for (int j = i+1; j < arr.length-i+1; j++) {
					arr[j+1] = arr[i+1];
				}
				arr[i+1] = 0;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
