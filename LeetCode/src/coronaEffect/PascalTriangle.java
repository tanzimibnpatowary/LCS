package coronaEffect;

import java.util.ArrayList;
import java.util.List;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 26, 2020 10:04:32 AM
 */
public class PascalTriangle {
	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        if (numRows <=0){
            return triangle;
        }
        for (int i=0; i<numRows; i++){
            List<Integer> row =  new ArrayList<Integer>();
            for (int j=0; j<i+1; j++){
                if (j==0 || j==i){
                    row.add(1);
                } else {
                    row.add(triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j));
                }
            }
            triangle.add(row);
        }
        return triangle;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numrow = 5;
		System.out.println(generate(numrow));
		 
	}

}
