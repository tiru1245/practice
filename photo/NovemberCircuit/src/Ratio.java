import java.util.ArrayList;
import java.util.Scanner;

public class Ratio {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0) {
		int n=sc.nextInt();
		long a=0;
		long b=0;
		ArrayList<Pair> list=new ArrayList<Pair>();
		for(int i=0;i<n;i++) {
			long count=sc.nextLong();
			String c=sc.next();
			if(c.charAt(0)=='A') {
				a=+count;
			}
			else {
				b+=count;
			}
			
			list.add(new Pair(count,c.charAt(0)));
		}
		
		if(a==0||b==0) {
			if(a!=0)
			System.out.println(a);
			else
			System.out.println(b);
		}
		else {
	
		long c=Math.max(a, b);
		long d=Math.min(a, b);
        long gcd=gcd(c,d);
        long e=a/gcd;
        long f=b/gcd;
        if(e==f) {
        	
        }
			System.out.println(gcd);
		}
			
		
		
	}
}

public  static  long  gcd(long a,long b) {
	if(b==0) {
		return a;
	}
	return gcd(b,a%b);
}
}
class Pair{
	long count;
	char c;
	public Pair(long count,char c) {
		this.count=count;
		this.c=c;
	}
}
