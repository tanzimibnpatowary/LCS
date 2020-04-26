package another;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 19, 2020 4:02:39 PM
 */
public class ValidBoomerang {
	public static boolean isBoomerang(int[][] points) {
		return (points[1][0] - points[0][0]) * 
				(points[2][1] - points[0][1])
				- (points[2][0] - points[0][0]) 
				* (points[1][1] - points[0][1]) != 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int points[][] = { { 1, 1 }, { 2, 3 }, { 3, 2 } };
		System.out.println(isBoomerang(points));

	}

}
