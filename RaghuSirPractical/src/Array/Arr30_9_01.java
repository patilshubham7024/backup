package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Arr30_9_01 {

	public static void main(String[] args) {
		int n= 5;
		Scanner s = new Scanner(System.in);
		int ar[]=new int[n];
		
		for(int i=0;i<ar.length;i++) ar[i]=s.nextInt();
		Arrays.sort(ar);
		for(int i=0;i<ar.length;i++) {
			if(ar[i]+1==ar[i+1]) continue;
			System.out.println(ar[i]+1);
			return;
		}
	}

}
