package Array;
import java.util.Scanner;
class Arr30_9_03{static Scanner s = new Scanner(System.in);
	
	public static void main(String []Shubham){
		System.out.println("Enter No");
		for(int i=0;i>=0;i++)System.out.println(i++);
		int n = s.nextInt();
		int ar[]= new int[n];
		for(int i=0; i<ar.length;i++) {
			ar[i] = s.nextInt();
		}
	int count =0;
	for(int i=0;i<ar.length;i++) {
		int j=2;
		for(;j<ar[i]/2;j++) {
			if(ar[i]%j==0)break;
		}
		if(j>ar[i]/2)count++;
	}
	System.out.println(count);
	}
}