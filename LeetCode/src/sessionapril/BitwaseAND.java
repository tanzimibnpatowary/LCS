package sessionapril;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 23, 2020 9:20:56 PM
 */
public class BitwaseAND {
	public static int rangeBitwiseAnd(int m, int n) {
        int store = 0;
        for(int i = m; i <=n-1; i++){
            store = m&m+1;
        }
        return store;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 5;
		int n = 7;
		System.out.println(rangeBitwiseAnd(m, n));
	}

}
