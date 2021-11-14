import java.util.Scanner;
class Eligibility { static Scanner s = new Scanner(System.in );

	public static void main(String[] args) {
System.out.println("Enter age");
int a = s.nextInt();
if (a>=18)System.out.println("Eligible");
else System.out.println("Not Eligible");
	}

}
