class Polymorphism {
static void run() {};
	public static void main(String[] args) {
	Bike b1 = new Splendor();
	b1.run();
	Bike b2 = new RX350();
	b2.run();
//	Bike t = new run();
	Bike g = new Bike();
	g.Bike();
	System.out.println(b1 instanceof Bike);
	if(b1 instanceof Bike) {
}
	}}
class Bike {
	void Bike() {
		System.out.println("this is bike");
		
	}
	void run(){
		System.out.println("Ride it");
	}
}
class RX350 extends Bike{
	void run() {
		System.out.println("Ride RX350");
	}
}
class Splendor extends Bike{
	void run() {
		System.out.println("Ride Splendor");
	}
}