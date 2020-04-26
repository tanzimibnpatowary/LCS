package onetoten;
class SolutionCP {
    public int countPrimes(int n) {
    	if (n <= 1)
    		return 0;
    	int[] flag = new int[n];
    	for (int i = 2; i < n; i++)
    		flag[i] = 1;
    	for (int i = 2; i <= (int) Math.sqrt(n); i++) {
    		if (flag[i] == 1) {
    			for (int j = i; j * i < n; j++) {
    				flag[j * i] = 0;
    			}
    		}
    	}
    	int count = 0;
    	for (int i = 2; i < n; i++) {
    		if (flag[i] == 1)
    			count++;
    	}
    	return count;
    }
}
public class CountPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target = 10;
		SolutionCP mCp = new SolutionCP();
		System.out.println(mCp.countPrimes(target));
	}

}
