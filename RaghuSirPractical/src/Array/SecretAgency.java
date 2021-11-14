package Array;
import java.util.*;
public class SecretAgency {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch>='A' && ch<='Z' || ch>='a' && ch<='z' || ch>='0' && ch <='9')
				count++;
		}
		System.out.println(str.length()- count);
		
		
		
		
	}

}
