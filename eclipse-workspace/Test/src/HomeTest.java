import java.util.Scanner;

class HomeTest {static Scanner n= new Scanner(System.in);
static HomeTest o = new HomeTest();
void ask() {System.out.println("Would you like to pay bill now??\n1)y\n2)n");}
static void enter() {
	System.out.println("enterrrr method");
	char x = n.next().charAt(0);
	System.out.println(x);
	o.Payop(x);
}
void Payop(char x){ if(x=='y') {
	System.out.println("Payment options.:");
	o.options();
}
else if(x=='n') {
	System.out.println("OKAY, Have a GREAT Day...");	
}
else {
	System.out.println("Please enter a valid option");
	o.ask();
	enter();
}
}
void options(){System.out.println("1)UPI\n2)Card Payment\n3)Net Banking");
String y = n.toString();
if (y=="1") {System.out.println("Upi");
UPITest u = new UPITest();u.UPITest();}
else if(y=="2") {System.out.println("Card");
	
}

}

public static void main(String[] args) {
	System.out.println("Hi, How are you");
	o.ask();
	enter();
}

}
