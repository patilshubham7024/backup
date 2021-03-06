package Pattern;

public class Test {
	static boolean isArm(int num) {
		int temp=num, sum=0;
		 do{
			int r= temp%10;
			sum=sum+r*r*r;
			temp=temp/10;
		}while(temp%10!=0 || temp>10);
		if (num==sum) return true;
		else return false;
	}
	static int addEven(int num) {
		int sum=0;
		do {
			int d=num%10;
			if(num%2==0)sum=sum+d;
			num=num/10;
		}while(num%10!=0||num>10);
		return sum;
	}
	static int addOdd(int num) {
		int sum=0;
		do {
			int d=num%10;
			if(num%2==1)sum=sum+d;
			num=num/10;
		}while(num%10!=0||num>10);
		return sum;
	}
	public static void main(String[] args) {
		int n=407;
		System.out.println("Is Armstrong "+isArm(n));
		if(isArm(n))System.out.println(addEven(n));
		else System.out.println(addOdd(n));
	}

}