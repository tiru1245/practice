import java.util.Scanner;

public class FindDigits {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0) {
		long n=sc.nextLong();
		long num=n;
		int count=0;
		while(n>0) {
			int l=(int) (n%10);
			if(l!=0){
				if(num%l==0) {
					count++;
				}
			}
			n/=10;
		}
		System.out.println(count);
	}
}
}
