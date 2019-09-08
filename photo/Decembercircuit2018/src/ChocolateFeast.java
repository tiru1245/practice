import java.util.Scanner;

public class ChocolateFeast {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0) {
		long n=sc.nextLong();
		long c=sc.nextLong();
		long m=sc.nextLong();
		long total=n/c;
		long wraper=total;

		while(true) {
			if(wraper<m) {
				break;
			}
			n=wraper/m;
			total+=n;
			long r=wraper%m;
			wraper=n+r;
			
		}
		System.out.println(total);
		
	}

	
}
}
