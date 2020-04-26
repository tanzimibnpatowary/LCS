package tentotwenty;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 10, 2020 10:09:51 PM
 */
public class CountNegative {
	public static int countNegatives(int[][] grid) {
		int count = 0;
        for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j <grid[0].length; j++) {
				if (grid[i][j]<0) {
					count++;
				}
			}
		}
        return count;
    }
	public static void main(String[] args) {
		int[][] grid = {{4,3,2,1},{-1,-1,-2,-3}};
		System.out.println(countNegatives(grid));
		
	}
}
