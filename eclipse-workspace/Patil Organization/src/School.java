class School {
	String Principal = "Shubham";
	String Class_Teacher;int Total_strength,Boys,Girls;
	public static void main(String [] Shubham) {
	School Std1 = new School();
	Std1.Boys=34;		Std1.Girls=30;
	Std1.Class_Teacher="Saif";
	Std1.Total_strength=Std1.Boys+Std1.Girls;
	System.out.println("Hello Standard-01");
	System.out.println("Principal - "+Std1.Principal);
	System.out.println("Class Teacher - "+Std1.Class_Teacher);
	System.out.println("Total no of Boys - "+Std1.Boys);
	
	System.out.println("Total no of Girls - "+Std1.Girls);
	System.out.println("Total strength of class - "+Std1.Total_strength);	
	School Std2 = new School();
	Std2.Boys=35; 		Std2.Girls=25;
	Std2.Class_Teacher="Vikas";
	Std2.Total_strength=Std2.Boys+Std2.Girls;
	System.out.println("\nHello Standard-02");
	System.out.println("Principal - "+Std2.Principal);
	System.out.println("Class Teacher - "+Std2.Class_Teacher);
	System.out.println("Total no of Boys - "+Std2.Boys);
	System.out.println("Total no of Girls - "+Std2.Girls);
	System.out.println("Total strength of class - "+Std2.Total_strength+"\n");	
	
	if (Std1.Total_strength		 < 	Std2.Total_strength) {
		System.out.println("Standard 2 have more Students i.e="+Std2.Total_strength); 	}
	
	else if(Std1.Total_strength		==	Std2.Total_strength)
		System.out.println("Both Standards have same strength"); 
	else 
		System.out.println("Standard 1 have more Students i.e="+Std1.Total_strength);
}

}
