import java.util.Scanner;

public class Totalcost {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	long p=sc.nextLong();
	long s=sc.nextLong();
	long t=sc.nextLong();
	long h=sc.nextLong();
	long x=sc.nextLong();
	long amount=0;
	for(int i=1;i<=x;i++) {
		if(s<=t) {
			amount+=h;
		}
		else {
			amount+=p;
		}
		s--;
	}
	System.out.println(amount);
	
		
	
}
}
