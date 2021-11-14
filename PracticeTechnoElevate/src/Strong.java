import java.util.Scanner;
class Strong{static Scanner s = new Scanner(System.in);
	
		static int factorial(int rem) {
			int x=1;
			for(int i=rem;i>0;i--) {
				 x=x*i;
			}
			return x;
		}

	public static void main(String []Shubham){
		System.out.println("Enter No");
		int num = s.nextInt();
		int sum=0,temp=num;
		while(temp%10!=0){
					int rem=temp%10;
						int x= factorial(rem);
						System.out.println(x+" is Fact of "+rem);
						sum=sum+x;
						temp=temp/10;
				}
	
	if(sum==num) {System.out.println("Strong");}
	else System.out.println("Not Strong");
	}
}