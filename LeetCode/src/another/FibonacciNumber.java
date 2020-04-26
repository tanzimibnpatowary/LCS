package another;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 13, 2020 3:13:28 PM
 */
public class FibonacciNumber {
	public static int fib(int N) {
		int sum  = 0;
		int first = 0;
		int second = 1;
		for (int i = 1; i < N; i++) {
			sum = first + second;
			first = second;
			second = sum;
			
		}
        return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 4;
		System.out.println(fib(N));
	}

}
