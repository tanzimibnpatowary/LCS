package tentotwenty;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 10, 2020 10:40:23 PM
 */
public class TwoSumII {
	public static int[] twoSum(int[] numbers, int target) {
		int i = 0;
		int j = numbers.length - 1;
		while (i < j) {
			if (numbers[i] + numbers[j] > target) {
				--j;
			} else if (numbers[i] + numbers[j] < target) {
				++i;
			} else {
				return new int[] { i + 1, j + 1 };
			}
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = { 2, 7, 11, 15 };
		int target = 9;
		System.out.println(twoSum(numbers, target));

	}

}
