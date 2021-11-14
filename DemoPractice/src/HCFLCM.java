class HCFLCM {
	static int HCF(int i, int j) {
		int x=0;
		for(x=i;;x--) {
			System.out.println(x);
			if(i%x==0&&j%x==0)break;
		}
		return x;}
	static int LCM(int l,int m) {
		int y=0;
		for(y=m;;y++) {
			if(y%m==0&&y%l==0) break;
		}
		return y;}
	public static void main(String[] args) {
int i=0,j=0,l=0,m=0;
		int x=HCF(i,j);
		System.out.println("HCF "+x);
		int y=LCM(l,m);
		System.out.println("LCM "+y);
	}
	}