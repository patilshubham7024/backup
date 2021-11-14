import java.util.Arrays;

public class BingoLotteryGame {

	public static void main(String[] args) {
		int ar[]= {1,45, -4, -3, 19,15};
		
		Arrays.sort(ar);
		int sum=0;
		if(ar[0]*ar[1]> ar[ar.length-1]*ar[ar.length-2])
			sum=ar[0]+ar[1];
		else
			sum=ar[ar.length-1]+ar[ar.length-2];
	
	System.out.println(sum);
	}

}
