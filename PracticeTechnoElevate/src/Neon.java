import java.util.Scanner;
class Neon{static Scanner s = new Scanner(System.in);
	
	public static void main(String []Shubham){
		System.out.println("Enter No");
		int n = s.nextInt();
		int square = n*n,sum=0;
		while(square%10!=0) {
			int dig=square%10;
			sum=sum+dig;
			square=square/10;
		}
		if(n==sum) {System.out.println("Neon");}
		else System.out.println("Not");
	}
}