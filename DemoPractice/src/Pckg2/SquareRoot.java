package Pckg2;
import java.lang.Math;
import java.util.Scanner;
class SquareRoot{static Scanner s = new Scanner(System.in);
	
	public static void main(String []Shubham){
		System.out.println("Enter No");
		int input = s.nextInt();
		int sq1=0,sq2=1,i=0;
		while(sq2<=input) {
			sq1=sq2;
			sq2= i*i;
			i++;
		}
		int h=0;
		if(h++<10) {System.out.println("Doneeeee "+h);}
		if((input-sq1)<(sq2-input)) {System.out.println(sq1);}
		else System.out.println(sq2);
//	
//	int x = input,y=input, inc, dec;
//	while(Math.sqrt(input)%1!=0) {
//		x--;
//	}
//	inc = x;
//	while(Math.sqrt(input)%1!=0) {
//		y++;
//	}
//	inc = x;
//	System.out.println(x+" "+y);
	}
}