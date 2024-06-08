
public class evenNumberDigits {

	public static void main(String[] args) {
		int[]nums = {555,901,482,1771};
		System.out.println(findNumbers(nums));

	}
	
	public static int findNumbers(int[] nums) {
		int count =0;
		for (int i = 0; i < nums.length; i++) {
			int digits=0;
			int number = nums[i];
			while(number>0) {
				number/=10;
				digits++;
			}
			if(digits%2==0)count++;
		}
		return count;
        
    }

}
