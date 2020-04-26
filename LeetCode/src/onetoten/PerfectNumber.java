package onetoten;

public class PerfectNumber {
	public static boolean checkPerfectNumber(int num) {
		 if(num == 0){
	            return false;
	        }
	        int sum = 0;
	        for(int i = 1; i <= num/2; i++){
	            if(num%i == 0){
	                sum+=i;
	            }
	        }
		    return sum == num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 28;
		System.out.println(checkPerfectNumber(number));
	}

}
