import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SumToArray {

	public static void main(String[] args) {
		int[]num= {9,9,9,9,9,9,9,9,9,9};
		int k = 1;
		System.out.println(Arrays.toString(addToArrayForm(num,k).toArray()));
		
	}
	
	 public static List<Integer> addToArrayForm(int[] num, int k) {
		 List<Integer> result = new ArrayList<>();
	        int n = num.length;
	        int carry = k;
	        for (int i = n - 1; i >= 0; i--) {
	            int sum = num[i] + carry;
	            result.add(sum % 10);
	            carry = sum / 10;
	        }
	        while (carry > 0) {
	            result.add(carry % 10);
	            carry /= 10;
	        }
	        Collections.reverse(result);
	        return result;
		 
	    }

}
