import java.util.Scanner;

class Home { 
	static Scanner n= new Scanner(System.in);static Home o = new Home();
	String i="7024",p ="0000";
	void ask() {System.out.println("Would you like to pay bill now??\n1)y\n2)n");}
	void options() {System.out.println("1)Card Payment\n2)UPI\n3)Net Banking");}
	void success() {System.out.println("Validation Successful");
	}
	static char enter() {
		System.out.println("eeeeeeeenter method");
		char x = n.next().charAt(0);
		System.out.println(x);
		
		payop(x);
		return x;
	}
	static void payop(char x) {
		if(x=='y') {
			System.out.println("How would you like to pay??");
			o.options();
			int y = n.nextInt();
			if (y==1) {System.out.println("Cards");
				Card c = new Card();
						}
			if (y==2) {System.out.println("Upi");
			upi u = new upi();
				if(u.upi()) {
					o.success();
				};
			System.out.println("Exit");
		}}
		else if(x=='n') {
			System.out.println("OKAY, Have a GREAT Day...");	
			}
		else {
			System.out.println("Please enter a valid option");
			o.ask();
			enter();
		}
	}
	
	public static void main(String[] Shubham) {
		
		
		System.out.println("Hi dude\nHow are you doing");
		o.ask();
		 enter();
		System.out.println("main menthod");
		
}}