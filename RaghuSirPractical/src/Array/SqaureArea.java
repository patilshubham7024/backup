package Array;
public class SqaureArea {
	public static void main(String[] args) {
		int ar[]= {45,26,57,3,29,9,81, 99, 16};
		int count=0;
		for(int i=0;i<ar.length;i++) {
			if(Math.sqrt(ar[i])%1==0)
				count++;
		}
		System.out.println(count);
	}
}
