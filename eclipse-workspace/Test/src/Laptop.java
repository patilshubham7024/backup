class Laptop {
	String Brand;
	double display_size;
	int price;
	Laptop(String x, double y,int z){
		Brand=x;
		display_size=y;
		price =z;
	}
	public static void main(String[] args) {
		Laptop l1=new Laptop("Dell",56.6,32000);
		System.out.println("Brand is "+l1.Brand);
		System.out.println("Display Size= "+l1.display_size+"Inches");
		System.out.println("Price is Rs."+l1.price);
		Laptop l2=new Laptop("HP",57,29500);
		System.out.println("Brand is "+l2.Brand);
		System.out.println("Display Size= "+l2.display_size+"Inches");
		System.out.println("Price is Rs."+l2.price);
		Laptop l3=new Laptop("Asus",56,28000);
		System.out.println("Brand is "+l3.Brand);
		System.out.println("Display Size= "+l3.display_size+"Inches");
		System.out.println("Price is Rs."+l3.price);
	}}