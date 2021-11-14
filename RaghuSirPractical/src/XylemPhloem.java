import java.util.Scanner;
class XylemPhloem{
	
	public static void main(String []Shubham){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int os=0, ms=0, t=n;
		do{
			int r=n%10;
			if(t==n || r==n){ os=os+r; }
			else ms=ms+r;
			
			n=n/10;
		}while(n!=0);
		if(ms==os)System.out.println("Xylem");
		else System.out.println("Phloem");
	}
}