
public class HighAltitude {

	public static void main(String[] args) {
		int[]gain = {-4,-3,-2,-1,4,3,2,6};
		System.out.println(largestAltitude(gain));
	}
	public static int largestAltitude(int[] gain) {
		int max = 0;
		int sum=0;
		for (int i = 0; i < gain.length; i++) {
			sum+=gain[i];
			if(sum>max)max=sum;
		}
        return max;
    }

}

