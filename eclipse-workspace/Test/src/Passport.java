public class Passport {
	String name;
	int age;
	long mob;
	Passport(){
		name="Shubham";
		age=24;
		mob=7757977024l;
	}
	public static void main(String[] args) {
		Passport p=new Passport();
		Passport p1=new Passport();
		System.out.println("Name="+p.name+"\nAge="+p.age+"\nMobile number="+p.mob);
	}

}
