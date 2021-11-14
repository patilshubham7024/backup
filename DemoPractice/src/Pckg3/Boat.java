package Pckg3;
//import Pckg2.Boat;

public class Boat implements ISwitch{
	void Shubham(){}
	{System.out.println("StaticBlock1");}
	{System.out.println("nonStaticBlock1");}

	public static int Xy() {System.out.println("Xy Meth");
	return 0;}
	public static void main(String[] args) {
		ISwitch i = new Boat();
		Boat b = new Boat();
		System.out.println(Boat.Xy());
		Boat bv = new Boat();
		Boat.Xy();
		}
	public void switchON() {
		
		
		
		
	}
}
