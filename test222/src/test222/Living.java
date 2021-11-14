package test222;

 class Living {
	 void eat() {
	 }
	 public static void main(String[] args) {
		 System.out.println("Super class");
		 Living l = new snake();
		 for (int i=1; i>0;) {System.out.println("*");}
	 }
}
class snake extends Living{
	@Override
	void eat() {
		System.out.println("SubClass");
	}
}
class Test{
}