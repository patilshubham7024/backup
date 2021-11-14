package Pckg1;

public class Nokia extends Samsung{

	public static void main(String[] args) {
		System.out.println("Pckg 1");
	
		Samsung m = new Samsung();
		System.out.println(Samsung.Shubham+" "+m.x+" "/*+m.y*/+" "+m.z);
		Samsung s = new Samsung();
		s.Shubham();
		s.x();
		s.y();
//		s.z();
	}
}