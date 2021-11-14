package Pckg2;
public class Boat {
	Boat(){
		{int x=0;}
		int x=10;
		System.out.println(x);
	}
	static{System.out.println("StaticBlock1");}
	{System.out.println("nonStaticBlock1");}

	public static boolean Xy() {System.out.println("Xy Meth");
	return true;}
	public static void main(String[] args) {
		Boat b = new Boat();
		System.out.println(Boat.Xy());
		Boat b1 = new Boat();
		b.Xy();
		}
}
