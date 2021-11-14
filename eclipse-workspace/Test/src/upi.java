class upi extends Home{int j,k; String i="7024";
					boolean upi(){Checkid();
//					if(Checkid()) {
//								j=1;}
					if(Checkp()) {
								k=1;}
						
					if(j==1 || k==1){
					return true;
					}
					else return false;
					}
	 void Checkid() {
					 System.out.println("Enter UPI id......");
					 System.out.println("17");String i = n.nextLine();
					 System.out.println(this.i);if(i.equals(this.i)) {
						System.out.println("id ok");
						//return true;
					}
			else{System.out.println("22");
						System.out.println("Returning error");
						error('i');
						//return false;
						}
				}
	 boolean Checkp(){
		System.out.println("Enter password");
					String p = n.nextLine();
					if(this.p.equals(p)) {
					return true;
					}
					else{
						error('p');
					return false;}
				}
	 void error(char x) {
		if(x=='p') {
			System.out.println("Incorrect password");
			Checkp();
		}
		if(x=='i') {
			System.out.println("Id not found");
			Checkid();	
		}
	}
}