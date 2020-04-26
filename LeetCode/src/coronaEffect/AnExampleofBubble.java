package coronaEffect;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 25, 2020 9:50:11 PM
 */
public class AnExampleofBubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,4,2,1,3};
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[i]>arr[j]) {
					int tem = arr[i];
					arr[i] = arr[j];
					arr[j] = tem;
					count++;
				}
			}
		}
	}

}
