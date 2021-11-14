import java.util.Scanner;
class Month {
	static Scanner s = new Scanner(System.in );
	public static void main(String[] args) {
		System.out.println("Enter Month no");
		int n =s.nextInt();
		if (n>0 && n<13) {
			System.out.println("Valid");
		if(n==1||n==3||n==5||n==7||n==8||n==10||n==12)System.out.println("31Days");
		else if(n==2)System.out.println("28 or 29 days");
		else System.out.println("30Days");
		
		}
		else System.err.println("Invalid");
	}
}
//jan=31
//feb=28/29
//march=31
//april=30
//may=31
//june=30
//july=31
//aug=31
//sept=30
//oct=31
//nov=30
//dec=31
