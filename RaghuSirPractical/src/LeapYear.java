import java.util.Scanner;
class LeapYear{
public static void main(String [] args){
 Scanner s = new Scanner(System.in);
int y = s.nextInt();
		
if(y%400==0||y%100!=0 && y%4==0)
System.out.println("leap year");
else
System.out.println("not leap year");
}}