public class Employee {
	String name,job;
	int sal,hireyear;
	void Employee(int s){
		Employee e2=new Employee(2022,64435);
	}
	Employee(int x,int y){
		name="Shubham";
		job="Developer";
		hireyear=x;
		sal=y;
	}
	public static void main(String[] args) {
		Employee e=new Employee(2021,12092849+5);
		System.out.println("Name= "+e.name+"\nJob Profile= "+e.job+"\nYear of hiring= "+e.hireyear+"\nSalary= "+e.sal);
		Employee e2=new Employee(2022,64435);
		System.out.println("Name= "+e2.name+"\nJob Profile= "+e2.job+"\nYear of hiring= "+e2.hireyear+"\nSalary= "+e2.sal);
	}}