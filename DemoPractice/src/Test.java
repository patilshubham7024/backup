class Test {
	public static void main(String[] args) {
		int a=1, b=0, c=5,i=0;
		
		int sum=a+b+c;
		if(sum%3==0) {
		int s=sum/3;			
	for(; a!=s && b!=s && c!=s;i++) {
		if(a<c) {
			c--; a++;
		}
		if(a<b) {b--;a++;
		}
		 if(b<c) {b++;c--;}
	}}
	System.out.println(a+" "+b+" "+c+" "+i);
}}