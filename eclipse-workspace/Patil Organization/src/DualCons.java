
public class DualCons {
	int div;
	String name;
	int age=24;
	DualCons(int s,String n){
	div=s;	
	name=n;
	//int age = s;
System.out.println(this.age);
System.out.println(s);}
	public static void main(String[] args) {
			
		DualCons d = new DualCons(1,"Shubham");
		System.out.println(d.name+"-"+d.div+"-"+d.age);
		DualCons d1 = new DualCons(2,"Patil");
		System.out.println(d1.name+"-"+d1.div+"-"+d1.age);
	
		}

}
