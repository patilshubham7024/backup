
public class Student {
	String name,DOB;
	int rollno,a=1;
	double hght;
	Student(){}
	Student(String n, int r, String d, double h){
	name=n;
	DOB=d;
	rollno=r;
	hght=h;
			
	}
	public static void main(String[] args) {
		Student s1=new Student("Shubham", 21,"24-05-1997", 5.9);
		System.out.println("Name of the student is "+s1.name);
		System.out.println("His roll no is "+s1.rollno);
		System.out.println("His height is "+s1.hght+"feet");
		
		Student s2=new Student("\nSaifali", 20,"06-04-1998", 5.5);
		System.out.println("Name of the student is "+s2.name);
		System.out.println("His roll no is "+s2.rollno);
		System.out.println("His height is "+s2.hght+"feet");
		
		Student s3=new Student("\nGomtesh", 23,"10-06-1999", 5.9);
		System.out.println("Name of the student is "+s3.name);
		System.out.println("His roll no is "+s3.rollno);
		System.out.println("His height is "+s3.hght+"feet");
		
		Student s4=new Student("\nAshish", 19,"25-07-1995", 5.2);
		System.out.println("Name of the student is "+s4.name);
		System.out.println("His roll no is "+s4.rollno);
		System.out.println("His height is "+s4.hght+"feet");
		
		Student s5=new Student("\nKing",100,"01-01-2000", 6.0);
		System.out.println("Name of the student is "+s5.name);
		System.out.println("His roll no is "+s5.rollno);
		System.out.println("His height is "+s5.hght+"feet");
		
		Student h=new Student();

	}

}
