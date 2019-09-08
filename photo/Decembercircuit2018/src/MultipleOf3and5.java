import java.util.Scanner;

public class MultipleOf3and5 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0) {
		long amount=sc.nextLong();
		long sum3=0;
		long sum5=0;
		long sum15=0;
		if(amount%3==0) {
			 sum3=(amount/3)-1;
		}
		else {
			 sum3=amount/3;

		}
		if(amount%5==0) {
			 sum5=(amount/5)-1;
		}
		else {
			 sum5=amount/5;

		}
		if(amount%15==0) {
			 sum15=(amount/15)-1;
		}
		else {
			 sum15=amount/15;

		}
		
		long sum3a=3*((sum3*(sum3+1))/2);
		long sum5a=5*((sum5*(sum5+1))/2);
		long sum15a=15*((sum15*(sum15+1))/2);
		System.out.println(sum3a+sum5a-sum15a);
	}
	
	
	
}
}
