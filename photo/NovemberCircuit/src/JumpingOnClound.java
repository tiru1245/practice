import java.util.Scanner;

public class JumpingOnClound {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int en=100;
		for(int i=0;i<n;) {
			int l=(i+k);
			int index=l%n;
			if(a[index]==1) {
				en=en-1-2;
			}
			else {
				en=en-1;
			}
			i=index;
			if(n==l)
			{
				break;
			}
			
			
		}
		System.out.println(en);
	}

}
