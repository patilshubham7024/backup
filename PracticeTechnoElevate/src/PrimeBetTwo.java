import java.util.Scanner;
public class PrimeBetTwo{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int first = s.nextInt();
		int last = s.nextInt();
		for( ; first <= last ; first++)
		{
			int count =1;
			for(int i = 2 ; i <= first/2 ; i++)	
			{
				if(first % i == 0)
					count=0;
			}
			if(count==1)
				System.out.println(first);
		}
	}
}