package coronaEffect;

import java.util.Arrays;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 25, 2020 7:50:22 PM
 */
public class ReplaceElement {
//	public static int[] replaceElements(int[] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			
//		}
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {17,18,5,4,6,1};
		int[] dub = arr;
		//System.out.println(replaceElements(arr));
		arr[arr.length-1] = -1; 
		Arrays.sort(dub);
		int j = 0;
		int m = 5;
		System.out.println(Integer.toString(m));
		int point = 0;
		int prepoint = 0; 
		for (int i = 1; i < arr.length; i++) {
			if (arr[i]==dub[j]) {
				prepoint = i;
				for (int k = prepoint; k >= point; k--) {
					arr[k] = dub[j]; 
				}
				j++;
				point = prepoint;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
