import java.util.Scanner;

class SingleDigit { static Scanner s =new Scanner(System.in);

	public static void main(String[] args) {
		 int x = s.nextInt();
		 if (x>=0 && x<=9)System.out.println(x+"=Single digit");
		 else System.out.println(x+"=Not single digit");
	}

}
