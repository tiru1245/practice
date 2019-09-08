import java.util.Arrays;
import java.util.Scanner;

public class EqualMutiSet {
	
	public static void main(String[] args) {
		long m=1000000007;
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long a[]=new long[(int) n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextLong();
		}
		Arrays.sort(a);
		long b[]=new long[(int) n];
		for(int i=0;i<n;i++) {
			b[i]=sc.nextLong();
		}
		Arrays.sort(b);
		long min=0;
		for(int i=0;i<n;i++) {
			long numa=a[i];
			long numb=b[i];
			if(numa>numb) {
				min+=(numa-numb)%m;
			}
			else  if(numb>numa){
				min+=(numb-numa)%m;
			}
		}
		
		System.out.println(min);
	}

}
