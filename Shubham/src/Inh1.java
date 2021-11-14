 class Inh1 {
	 int i = 44;
	 Inh1(){
		 Inh1 d = new Inh1();
		 Inh1 f = new Inh1();
//		 Inh1.i = 6;
		int a = 0;
		System.out.println(d.i+ f.i +i);
		System.out.println(a+" Gets printed");
	Inh1.xy();
	}
	static int xy() {
		int x = 0;
		System.out.println("x="+x);
		System.out.println();
		return 2;
		
	}
	public static void main(String[] args) {
	Inh1 i = new Inh1();
	System.out.println(i.i);
	Inh1.xy();
	}
}