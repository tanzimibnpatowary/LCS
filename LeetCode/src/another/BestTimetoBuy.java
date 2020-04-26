package another;

import java.util.Arrays;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 13, 2020 9:50:38 PM
 */
public class BestTimetoBuy {
	public static int maxProfit(int[] prices) {
		int maxprofit = 0;//7,1,5,3,6,4
		int length = prices.length;
		int result = 0;
		for (int i = 0; i < prices.length; i++) {
			for (int j = i; j < length; j++) {
				maxprofit = (prices[j]-prices[i]);
				if (maxprofit>0) {
					if (result<=maxprofit) {
						result = result + maxprofit;
						maxprofit = 0;
					}
				}
				
			}
		}
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {3,3,5,0,0,3,1,4};
		System.out.println(maxProfit(prices));
	}

}
