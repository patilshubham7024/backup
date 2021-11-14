package Array;

public class SumOfEveOdd {
	static int[] sumEve(int a[]) {
		int sum[]= {0,0};
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0)sum[0]=sum[0]+a[i];
			else sum[1]=sum[1]+a[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int a[]= {2,5,7,6,3,9,3};
		int sum[]=sumEve(a);
		System.out.println(sum[0]+" "+sum[1]);
		
	}

}
