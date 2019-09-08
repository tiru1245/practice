import java.util.Scanner;

public class GoodNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a[]=new int[100001];
	a[0]=0;
	a[1]=0;
	a[2]=1;
	for(int i=3;i<a.length;i++) {
		if(i%2==0) {
			if(i%4!=0) {
				a[i]=a[i-1]+1;
			}
			else {
				a[i]=a[i-1];
			}
		}
		else {
			a[i]=a[i-1];
		}
	}
	int t=sc.nextInt();
	while(t-->0) {
		int n=sc.nextInt();
		System.out.println(a[n]);
	}
	
}
}
