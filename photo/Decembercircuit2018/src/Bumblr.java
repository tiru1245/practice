import java.util.Scanner;

public class Bumblr {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long a[]=new long[10000];
		long m=1000000007;
		a[0]=1;
		a[1]=7;
		long b[]=new long[10000];
		b[0]=1;
		b[1]=8;
        long ed=6;
		for(int i=2;i<10000;i++) {
			ed=(ed*2)%m;
			a[i]=ed%m+a[i-1]%m;
			b[i]=b[i-1]%m+a[i]%m;
		}
		int t=sc.nextInt();
		while(t-->0) {
			int c=sc.nextInt();
			int n=sc.nextInt();
			System.out.println((b[n-1]%m*c%m)%m);
		}
	}

}
