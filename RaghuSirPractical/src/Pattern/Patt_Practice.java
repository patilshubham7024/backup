package Pattern;

public class Patt_Practice {

	public static void main(String[] args) {
		int n=9,sp=n/2,st=1,x=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) System.out.print("  ");
			for(int j=1;j<=st;j++) 
				if(j==1||j==st)System.out.print(x+" ");
				else System.out.print("  ");
			
			if(i<=n/2) {sp--;x++; st+=2;}
			else {sp++; st-=2;x--;}
		System.out.println();
		}
	}

}
