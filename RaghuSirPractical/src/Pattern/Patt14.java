package Pattern;
public class Patt14 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=(n-i)*2;j++) System.out.print(" ");
			
			for(int j=1;j<=i;j++) System.out.print(j%2+" ");
		
			for(int j=i;j>1;) System.out.print(--j%2+" ");
			
			System.out.println();
		}
	}
}