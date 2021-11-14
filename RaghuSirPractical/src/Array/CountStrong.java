package Array;
import java.util.Scanner;
public class CountStrong extends Object{
	static boolean checkStrong(int a[]){
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+calFactorial(a[i]);
		}
		return false;
	}
	static int calFactorial(int x) {
		int fact=1;
		while(x>0) {
			fact=fact*x;
			x--;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Size of array");
		int n=s.nextInt();
		int ar[]= new int[n];
		for(int i=0;i<n;i++)
			ar[i]=s.nextInt();
		
//		CountStrong.checkStrong();
		
	}

}
