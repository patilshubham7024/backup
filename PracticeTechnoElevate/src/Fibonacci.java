import java.util.Scanner;
class Fibonacci{static Scanner s = new Scanner(System.in);
	
	public static void main(String []Shubham){
		System.out.println("Enter No");
		int n = s.nextInt();
		int f1=0, f2=1;
		while(f1<n) {
			System.out.println(f1);
			int f3=f1+f2;
			f1=f2;
			f2=f3;
		}
		
	}
}