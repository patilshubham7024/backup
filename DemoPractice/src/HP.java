class HP extends Mouse{ 
	HP(){}
	int Shubham =999;
 void click() {
	System.out.println("Select HP");
 	super.click();}
	public static void main(String[] args) {
		Mouse m = new HP();
		m.click();System.out.println(m.Shubham);
		HP h=(HP)m;
		h.click();
		System.out.println(h.Shubham);
	}}