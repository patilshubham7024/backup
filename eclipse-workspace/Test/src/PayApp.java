import java.util.Scanner;

public class PayApp {
	void payBill(long cno, int cvv, String exdate) {
				long a=12345;	int b=222;	String c= "01-01-21";
				if(cno!=a) {System.out.println("Please enter valid card number");}
				else if(cvv!=b) {wrong();}
				else if(exdate!=c) {wrong();}
				else success();	}
	void payBill(String upi) {String a="7757s";
				if (upi!=a) {System.out.println("Please enter valid id");}
				else success();	}
	void payBill(String uid, String pwd) {
				String a="7757s", b="1234";
				if (a!=uid) {System.out.println("Please enter a valid username");}
				else if(b!=pwd){System.out.println("Incorrect password\nForgot password??");}}
	static void wrong() {System.out.println("Something went wrong.\nPlease check credentials you entered");}
	void success() {System.out.println("Validation Successful");
	}
	void options() {System.out.println("1)Card Payment\n2)UPI\n3)Net Banking");}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner n= new Scanner(System.in);
		PayApp P = new PayApp();
		System.out.println("Hi SHUBHAM\nHow are you today??");
		System.out.println("Would you like to pay bill now??\n1)Yes\n2)No");
		
		int o =n.nextInt();
		PayApp.wrong();
		if (o==2) {System.out.println("OKAY, Have a GREAT Day...");	
		}
		else if(o==1) { System.out.println("How would you like to pay now??");
		P.options();
		int p =n.nextInt();
		if(p==1){
		 P.payBill(213213l, 222, "shubham");
		}else if(p==2) { P.payBill("7757sn");
		}else if(p==3) { P.payBill("shu77","s22332");
		}else {//		for (int c=n.nextInt();c<1&&c>3;) {
			System.out.println("Please choose a valid option");
			//P.options();}
		}}
		}}
		