package Pattern;
class Patt4{
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=0;j<n-i;j++)System.out.print("  ");
			for(int j=i;j>0;j--) {
				if(j<=i)System.out.print(+j+" ");
			}System.out.println();
		}
	}
}