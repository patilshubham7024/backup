package Array;

public class DeleteArr {

	public static void main(String[] args) {
		int a[]= {1,4,234,56,78};
		int b[]= new int[a.length-1];
		int d=3;
		for(int i=0;i<a.length;i++) {
			if(i<d) {
				b[i]= a[i];
			}
			else 
				b[i--]=a[i];
		}
		for(int k=0;k<b.length;k++)
		System.out.print(b[k]+" ");
		
	
	}

}
