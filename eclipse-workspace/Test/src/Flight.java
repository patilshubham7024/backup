class Flight {
	int notr=43;
	String  from,to, dep;
	Flight(String from, String to){
		from=from;
		System.out.println(from);
		this.to=to;
		System.out.println("From "+from);
		System.out.println("To "+this.to);
	}		
	Flight(String dep){
		this.dep=dep;
		System.out.println("Date of departure: "+this.dep);
	}				
	Flight( int notr){
		this.notr=notr;	
		System.out.println("No of Travellers: "+this.notr);
	}
	public static void main(String[] args) {
		String from="Kolhapur",to ="Bangalore", dep="11-07-2021";
		int notr=465465365;
		Flight x=new Flight(from, to);
		Flight y=new Flight(dep);
		Flight z=new Flight(notr);
		Student h=new Student();
		System.out.println(h.a);
	}}