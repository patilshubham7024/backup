public class Product {
	String type;
	int qty, price;
	Product(){
		type="Soap";
	}
	public static void main(String[] args) {
	Product p=new Product();
	System.out.println(p.type);
	}
}