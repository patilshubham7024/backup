class Test1 extends Object{
	 int x, y, z ;
	 static void login(String un, int pin) {
		Test1 t = new Test1();
		System.out.println(t.x);
		if(un == "Patil") {
			if(pin ==7024) {
				t.logsuccess();
			}else System.out.println("Fail-Pwd");
		}
		else System.out.println("Fail-un");
	}
	void login(String un, String pwd) {
		int g = 23;
		if(un== "Patil") {
			if(pwd == "s7024") {
				logsuccess();
			}else System.out.println("Fail-Pwd");
		}
		else System.out.println("Fail-un");
	}
	void logsuccess() {
		
		System.out.println("LogIn Successful");
	}
	public static void main(String[] Shubham) 
	{
		Test1 t = new Test1();
		System.out.println(t);
		t.login("Patil" , 7024);
		t.login("Patil", "s7024");
	}
}