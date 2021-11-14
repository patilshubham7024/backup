import java.util.Scanner;
class NoOfDig{static Scanner s = new Scanner(System.in);
	
	public static void main(String []Shubham){
		System.out.println("Enter No");
		int n = s.nextInt();
		int count=0;
		while(n!=0) {
			count++;
			n=n/10;
		}
		System.out.println(count);
	}
}