package Array;

import java.util.Scanner;

public class Palindrome {
	static int[] readArray() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Size of array");
		int n=s.nextInt();
		int ar[]= new int[n];
		for(int i=0;i<n;i++)ar[i]=s.nextInt();
		return ar;
	}
	static void display(int a[]) {
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
	}
	static boolean isPalindrome(int x) {
		return x== reverse(x);
	}
	static int reverse(int n) {
		int rev=0;
		do {
			rev= rev*10+n%10;
		}while(n!=0);
	return rev;
	}
	static int countPalindrome(int a[]) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			boolean rs = isPalindrome(a[i]);
		}

		return count;
	}
	public static void main(String[] args) {
		int a[]= readArray();
		display(a);
		int pc= countPalindrome(a);
		System.out.println("Total palindrome: "+pc);

	
	}

}
