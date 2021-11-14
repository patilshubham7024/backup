import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
public class WriteObjectDemo {

	public static void main(String[] args) throws Exception {
		TestSuper t1= new TestSuper(1, 3000, "Dinga" );
		FileOutputStream fls = new FileOutputStream("emp.data,txt");
		ObjectOutputStream oops = new ObjectOutputStream(fls);
		
		oops.writeObject(t1);
		oops.close();
		fls.close();
		
		System.out.println("Write Complete");
	}
}
