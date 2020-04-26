package sessionapril;

import java.util.Arrays;
import java.util.HashSet;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 23, 2020 9:42:08 AM
 */
public class FirstUniqueHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "loveleetcode";
		char n[] = s.toCharArray();
		char[] temp = new char[n.length];
		 int index = 0; 
		  
	        for (int i = 0; i < n.length; i++) 
	        { 
	            int j; 
	            for (j = 0; j < i; j++)  
	            { 
	                if (n[i] == n[j]) 
	                { 
	                    break; 
	                } 
	            } 
	            if (j == i)  
	            { 
	                n[index++] = n[i]; 
	            } 
	        }
	        System.out.println(String.valueOf(Arrays.copyOf(n, index)));
	}

}
