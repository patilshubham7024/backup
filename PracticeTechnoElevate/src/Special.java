import java.util.Scanner;
class Special{static Scanner s = new Scanner(System.in);
	
	public static void main(String []Shubham){
		System.out.println("Enter No");
		int n = s.nextInt();
		int last = n%10,first,m=n;
		do {
			 first=n%10;
			n=n/10;
		}while(n%10!=0);
	if(m==first+last+first*last)System.out.println("Special:");
	else System.out.println("Not");
	}
}