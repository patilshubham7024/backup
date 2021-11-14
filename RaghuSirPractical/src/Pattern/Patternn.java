package Pattern;
public class Patternn {
	public static void main(String[] args) {
		int n=20;
		for(int i=1;i<=n;i++) {
			int j;
			if(i<n/2)for(j=1;j<=i;j++)
			System.out.print("* ");
		
			if(i>=n/2) for(j=n-i;j>0;j--)
			System.out.print("* ");
			
			System.out.println();
		}
	}}
/*
	n	 i j   
	10	01-1
	10	02-2
	10	03-3
	10	04-4
	10	05-5
	10	06-4
	10	07-3
	10	08-2
	10	09-1



*/