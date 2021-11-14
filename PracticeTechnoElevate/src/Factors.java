import java.util.Scanner;
class Factors{static Scanner s = new Scanner(System.in);
	
	public static void main(String []Shubham){
		System.out.println("Enter No");
		int n = s.nextInt();
		for(int i=1;i<=n;i++) {
			if(n%i==0) {System.out.println(i);}
		}
	}
}