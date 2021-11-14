package Pckg1;

public class Samsung {
	public static double Shubham =1;
	protected static  double x=2;
	private static double y=3;
	static double z=4;
	
	public void x() {System.out.println("X");}
	protected void y() {System.out.println("Y");}
	private void z() {System.out.println("Z");}
	void Shubham() {System.out.println("Shubham");}
	public static void main(String[] args) {
		System.out.println(""+Shubham+x+y+z);
		Samsung s = new Samsung();
		s.Shubham();
		s.x();
		s.y();
		s.z();
	}
}