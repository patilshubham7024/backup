package Pattern;
public class Patt6 {
	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++){
			
			for(int j=1;j<=n-i;j++) System.out.print("  ");
			
			for(int j=i;j>0;j--) System.out.print(j+" ");
			
			for(int j=1;j<i;) System.out.print(++j+" ");
			
			System.out.println();
		}
	}
}