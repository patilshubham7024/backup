import java.util.Scanner;

class fromula {
	static double areat(double h, double b) {
		double x=h*b/2;
		return x;
	}
	 static double areac(double r) {
		double x=(22/7)*r*r;
	return x;
	}
	 static double areas(double q) {
		 double x=q*q;
		 return x;
	 }
	static void Printarea(double x, String h) {
		System.out.println("Area of "+h+" is "+x+"sqmm"+"\nThank You");
	}
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);

		System.out.println("Please select the shape\n1)Traingle\n2)Circle\n3)Sqaure");
	int s = n.nextInt();
		if(s==1) {
		System.out.println("Please enter height in cm");
		int h= n.nextInt();
		System.out.println("Please enter Base in cm");
		int b= n.nextInt();
		Printarea(fromula.areat(h, b), "Triangle");
		}
	else if (s==2){
		System.out.println("Please enter Radious in cm");
		int r= n.nextInt();
		Printarea(fromula.areac(r), "Cicle");
	}
	else if (s==3){
		System.out.println("Please enter side length in cm");
		int q= n.nextInt();
		Printarea(fromula.areas(q), "Sqaure");}
	
	else {System.out.println("Please try again!"); 
	}
}}