import java.util.Scanner;

public class Problem1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int q=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	while(q-->0) {
		int type=sc.nextInt();
		int l=sc.nextInt();
		int r=sc.nextInt();
		int x=sc.nextInt();
		if(type==1) {
			for(int i=l-1;i<=r-1;i++) {
				a[i]+=x;
			}
		}
		else {
			for(int i=l-1;i<=r-1;i++) {
				a[i]=x;
			}
		}
		
	}
	for(int i=0;i<n;i++) {
		System.out.println(a[i]);
	}
}
}
