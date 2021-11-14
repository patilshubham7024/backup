 class Player {
String name="Shubham";
 Player (int f){
	System.out.println("Im in cons of Player"+f);
}
	public static void main(String[] args) {
		Player b= new Player(2323);
	System.out.println(b.name);
	System.out.println("Main of Player");
	}
}