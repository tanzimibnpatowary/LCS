package onetoten;

public class AddDigits {
	    public static int addDigits(int num) {
	    	 if(num >= 0 && num <= 9){
	             return num;
	         }
	         int sum = 0;
	         while(num > 0){
	             sum += num%10;
	             num /= 10;//1 
	         }
	         return addDigits(sum);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 199;
		System.out.println(addDigits(number));
	}

}
