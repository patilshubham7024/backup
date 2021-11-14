import java.util.Scanner;
class LeapYear{static Scanner s = new Scanner(System.in);
	
	public static void main(String []Shubham){
		System.out.println("Enter Year");
		int n = s.nextInt();
		if(n%400==0 || n%100!=0 && n%4==0) {
			System.out.println("Leap year");
		}
		else System.out.println("Not Leap year");
	}
}