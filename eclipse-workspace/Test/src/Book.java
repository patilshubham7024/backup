class Book {
	String color;
	int pages;
	Book(String c, int p){
		color = c;
		pages = p;
	}
	public static void main(String[] shubham){
		Book b1= new Book("Red", 546);
		System.out.println("Color of the Book will be "+b1.color+".");
		System.out.println("Total "+b1.pages+" are there.");

		Book b2= new Book("Blue", 348);
		System.out.println("Color of the Book will be "+b2.color+".");
		System.out.println("Total "+b2.pages+" are there.");

	}}