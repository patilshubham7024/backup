public class Person {
	void run() {
		System.out.println("Fast Fast Run ");
	}
	void jump() {
		run();
		System.out.println("Jump from 8th floor");
	}
	void love() {
		System.out.println("I love MYSELF");
	}
	public static void main(String[] Shubham) {
		Person p=new Person();
		p.love();
		p.jump();
	}}