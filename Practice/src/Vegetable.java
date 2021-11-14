class Vegetable extends Object {
double qty;
int price;
void wash() {
	
}
public static void main(String[] args) {
	Vegetable c= new Carrot();
	 Carrot e = new Carrot();
//	 e=(Carrot)c;
	 c=e;
	 System.out.print(c);
//	 c.qty= 2.5;
//	 c.price= 150;
//	 c.wash();
//	 c.chop();
//	 System.out.println(Carrot.type);
//	 c.Make();
}
void chop() {
	
}
}
class Carrot extends Vegetable{
	String type = "Ooty Carrot";
	void Make() {}
}

