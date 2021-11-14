class Test{
	private int a=8;
	int b;
	Test(int a, int b){
		this.a = a;
		this.b = b;
		int n=1;
		System.out.println("Test_class "+"a = " + a + "\nb = " + b);	
	}
	public static void main(String[] args){
		String from="Kolhapur",to ="Bangalore", dep="11-07-2021";
		int notr=2;
		Flight x=new Flight(from, to);
		Flight y=new Flight(dep);
		Flight z=new Flight(notr);
		}
	}