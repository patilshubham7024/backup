package Array;

import java.sql.Array;

public class ZigZag {

	public static void main(String[] Shubham) {

			int a[]= {1,4,234,56,78};
		int b[]= {2,67,2,12};
		int c[]= new int[a.length+b.length];
		int i=0,j=0;
		while(i<a.length && i< b.length) {
			c[j]=a[i];j++;
			c[j]=b[i];j++; i++;
		}
		while(i<a.length) {
			c[j]=a[i]; j++; i++;
		}
		while(i<b.length) {
			c[j]=b[i]; i++;j++;
		}
	for(int k=0;k<c.length;k++)System.out.print(c[k]+" ");
	}

}
