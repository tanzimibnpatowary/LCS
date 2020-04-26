package onetoten;

public class CountPrime {
	public static int countPrimes(int n) {
		StringBuilder mBuilder = new StringBuilder();
		String finale;
		for(int j = 2; j < n; j++) {
	        if(n % j != 0) {
	        	int number = n;
	        	for (int i = 0; i < number; i++) {
		            mBuilder.append(i);
				}
	        }
	    }
	    return Integer.parseInt(mBuilder.toString());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 10;
		countPrimes(number);
	}

}
