import java.util.Scanner;
class Factorial{static Scanner s = new Scanner(System.in);
	
	public static void main(String []Shubham){
		System.out.println("Enter No");
		int n = s.nextInt();
		int fact=1;
		for(int i=n;i!=0;i--) {
			fact=fact*i;
		}
		System.out.println(fact);
	}
}