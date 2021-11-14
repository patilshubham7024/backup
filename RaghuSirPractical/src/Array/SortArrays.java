package Array;

public class SortArrays {

	public static void main(String[] args) {
		int a[]= {1,4,234,56,78};
		int b[]= {2,67,2,12};
		int c[]= new int[a.length+b.length];
		int i=0,j=0, k=0;
		while(i<a.length && j< b.length) {
			if(a[i]<b[j]) c[k++]=a[i++];
			else c[k++]= b[j++];
		}
		while(i<a.length) c[k++]=a[i++];
		while(j<b.length) c[k++]=b[j++];
		for(int l=0;l<c.length;l++)System.out.print(c[l]+" ");
		}

}
