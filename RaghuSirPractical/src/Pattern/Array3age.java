package Pattern;
import java.util.Scanner;

public class Array3age {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter ages");
		int a[]= {};
		for(int i=0;i<=5;i++) {
		a[i] = s.nextInt();
		}
		
		int x=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>x)x=a[i];
		}
	
	System.out.println("Elder "+x);
	}

}

