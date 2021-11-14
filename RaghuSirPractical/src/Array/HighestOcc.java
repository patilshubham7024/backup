package Array;

public class HighestOcc {

	public static void main(String[] args) {
		int n=37757;
		int c[]=new int[0];
		while(n!=0) {
			int r=n%10;
			c[r]++;
		}
		
		int in =0;
		for(int i=1;i<c.length;i++) {
			if(c[i]>c[in]) in=i;
		}
		System.out.println(in);
	}

}
