package another;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 13, 2020 3:45:08 PM
 */
public class NthTribonacci {
	public static int tribonacci(int n) {
        if(n==0){
            return  0;
        }
        int T1 = 0;//1
		int T2 = 1;//1
		int T3 = 1;//2
		int sum = 0;
        for (int i = 1; i < n-1; i++) {
        	sum = T1+T2+T3;//2
        	T1 = T2;
        	T2= T3;
        	T3 = sum;
		}
        return T3;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 25;
		System.out.println(tribonacci(n));
		//T2 = 0 + 0 +1=1
//		/T_3 = 0 + 1 + 1 = 2
//		T_4 = 1 + 1 + 2 = 4
	}

}
