package Pattern;
public class Patt15 {
	public static void main(String[] args) {
		int n=5;
		char x=65;
		for(int i=0;i<=n;i++) {
			for(int j=1;j<=(n-i)*2;j++)System.out.print(" ");
			
			for(int j=0;j<=i;j++) System.out.print((char)(x+j)+" ");
		
			for(int j=i;j>0;--j) System.out.print((char)(x+j-1)+" ");
			
			System.out.println();
		}
	}
}