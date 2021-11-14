class ExceptionHandling {
	static void meth() {
		try {int x=3/0;}
		catch(Exception e) {
			meth2();
			System.out.println(e);
		}
	}
	static void meth2() {
		System.out.println("Meth2222");
	}
	public static void main(String[] args) {
		meth();
	}

}
