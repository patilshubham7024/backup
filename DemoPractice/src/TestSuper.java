import java.io.Serializable;

class TestSuper implements Serializable{
	int id;
	String name;
	int salary;
	TestSuper(int id, int salary, String name) {
		this.id=id;
		this.name= name;
		this.salary=salary;
	}
	void work() {System.out.println("Employee works");}
}