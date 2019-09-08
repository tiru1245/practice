import java.util.Scanner;

public class Divide {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0) {
		long num=sc.nextLong();
		boolean prime=true;
		for(int i=1;i<=Math.sqrt(num);i++) {
			
			if(num%i==0) {
				prime=false;
				break;
			}
			
		}
		if(prime) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		
	}
}
}
