import java.util.Scanner;
class SumOfFirLast{static Scanner s = new Scanner(System.in);
	
	public static void main(String []Shubham){
		System.out.println("Enter No...");
		int n = s.nextInt();
		
		int first=0, last=n%10;
		while(n!=0) {
			first=n%10;
			n=n/10;
		}
		System.out.println(first+last);
		
	}
}