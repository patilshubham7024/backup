import java.util.Scanner;
class Prime{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
	int c=0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0){
				c++;
				break;
				}
				}
		if(c>0)
			System.out.println("Not Prime");
		else 
		{System.out.println("Prime");}
	}
}