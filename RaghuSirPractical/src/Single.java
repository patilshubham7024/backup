import java.util.Scanner;

class Single {static Scanner s = new Scanner(System.in );
	public static void main(String[] args) {
	int x = s.nextInt();
	
	int c=0;
	if(x>9 && x <100) {
	for(c =0;c>=0;c++ ) {
		int a= c/10;
		int b= c%10;
		
		if(a*b+a+b==c) {
			System.out.println(c+"=Special Digit.");
		}
		//else System.out.println(c+"=Not Special digit.");
	}}
//	else System.out.println("Enter 2 digit number");
//}
}}
