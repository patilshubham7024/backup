package Pattern;
import java.util.Scanner;
class Pattern{
	
    public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			if(j==1||j==n||(i<=(n+1)/2)&&(i==j||i+j==n+1))
				System.out.print(" * ");
			else System.out.print("   ");
			}
		System.out.println("\n");
		}
	}
    }
