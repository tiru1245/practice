import java.util.Scanner;

public class SeviceLane {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
		  a[i]=sc.nextInt();
		}
		while(t-->0) {
			int i=sc.nextInt();
			int j=sc.nextInt();
			int min=Integer.MAX_VALUE;
			for(;i<=j;i++) {
				if(a[i]<min) {
					min=a[i];
				}
			}
			System.out.println(min);
		}
		
	}

}
