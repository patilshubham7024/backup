import java.util.Scanner;
class ReverseNo{static Scanner s = new Scanner(System.in);
	
	public static void main(String []Shubham){
		System.out.println("Enter No");
		int n = s.nextInt();
		while(n!=0) {
			System.out.print(n%10);
			n=n/10;
		}
	}
}