package Array;
public class InsertEle {
	public static void main(String[] args) {
		int a[]= {1,4,234,56,78,456,3,22,7,2,1,};
		int b[]= new int[a.length+1];
		int d=5,e=33;
		for(int i=0,j=0;j<b.length;i++,j++) {
			if(j==d){
				b[j]=e;
				j++;
			}
			b[j]=a[i];
		}
	for(int k=0;k<b.length;k++)
		System.out.print(b[k]+" ");
	}
}