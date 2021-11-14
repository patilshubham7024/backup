
public class Mobile {
	String company,clr;
	int Storage,RAM,Battery;
	Mobile(){
		company="Samsung";
		Storage=32;
		RAM=3;
		Battery=5000;
		clr="Black";
	}
	public static void main(String[] args) {
		Mobile m=new Mobile();
		Mobile m1=new Mobile();
		Mobile m2=new Mobile();
		Mobile m3=new Mobile();
		Mobile m4=new Mobile();
		System.out.println("Company= "+m.company+"\nStorage in GB= "+m.Storage+"\nRAM in GB= "+m.RAM+"\nBattery in mAh= "+m.Battery+"\nColour= "+m.clr);

	}

}
