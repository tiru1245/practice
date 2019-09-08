import java.util.Scanner;

public class CostOfBalloans {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0) {
		int g=sc.nextInt();
		int p=sc.nextInt();
		int n=sc.nextInt();
		int first=0;
		int second=0;
		for(int i=0;i<n;i++) {
			first+=sc.nextInt();
			second+=sc.nextInt();
		}
		int fisttoal=(g*first)+(p*second);
		int secondtotal=(g*second)+(p*first);
		System.out.println(Math.min(fisttoal, secondtotal));
	}
}
}
