import java.util.Scanner;
class StudentPass {
	static Scanner s = new Scanner(System.in );
	public static void main(String[] args) {
	System.out.println("Enter makrs");
		double a = s.nextDouble();
		double b = s.nextDouble();
		double c = s.nextDouble();
		double d = s.nextDouble();
		if(a>39 && b>39 && c>39 & d>39) {
			double r = (a+b+c+d)/4;
			System.out.println(r+"%");
		}
		else System.err.println("Fail hys bhava tu...");
	}
}