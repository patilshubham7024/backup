package Array;
import java.util.Scanner;
class Arr30_9_02{
	static Scanner s = new Scanner(System.in);
	
	public static void main(String []Shubham){
		System.out.println("Enter No of %");
		int n = s.nextInt();
		double per[]= new double[n];
		System.out.println("Enter Per");
		for(int i=0;i<per.length;i++) {
			per[i]=s.nextDouble();
		}
		double small =per[0];
		for(int i=0;i<per.length;i++)
		{
			if(per[i]<small) small=per[i];
		}
		System.out.println("Smallest: "+small);
	}
}