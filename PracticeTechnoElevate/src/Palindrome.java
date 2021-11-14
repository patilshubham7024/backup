import java.util.Scanner;
class Palindrome {static Scanner s = new Scanner(System.in);
	static boolean checkPali(int num) {
		int reverse = 0,temp=num;
		do {
			int r=temp%10;
			reverse=reverse*10+r;
			temp=temp/10;		
		}while(temp!=0);
		System.out.println(reverse);
		if(reverse==num)return true;
		else return false;}
	public static void main(String []Shubham){
		System.out.println("Enter No");
		int n = s.nextInt();
		if(checkPali(n))System.out.println("Palindrome");
		else System.out.println("Not");
	}
}