package Pattern;
import java.util.Scanner;
public class patt35 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("WelCome SHUBHAM!\nEnter No of Lines");
		int n = s.nextInt();
		
		for(int i =1;i<=n;i++) {
			for(int j=1;j<=n-i;j++)
			System.out.print(" _");

			for(int j=1;j<=i*2-1;j++) {
			System.out.print((i+j)%2+" ");
		}
		System.out.println();
		}
	}
}