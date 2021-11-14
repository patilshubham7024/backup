import java.util.Scanner;

class EvenOdd {
static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		int x= s.nextInt();
		if(x%2==1)System.out.println("Odd number");
		else System.out.println("Even number");
	}

}
