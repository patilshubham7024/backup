class Inh1 extends Player {

	Inh1(int f) {
		super(98897987);
		System.out.println("Cons of Inh1");
	}
	int Player(){
		System.out.println("Method of Inh1");
		return 0;
	}
	public static void main(String[] args) {
		System.out.println("Main of Inh1");
		Inh1 b= new Inh1(0x10111);
		Player c= new Player(010111);
		System.out.println(b.name);
		Player v= new Player(10111);
	}
}