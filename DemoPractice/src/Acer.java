class Acer extends Mouse{
	@Override
	void click() {
		System.out.println("Select Acer");
	}
	public static void main(String[] args) {
		Mouse m = new HP();
		m.click();
		System.out.println(m.Shubham);
	}
}