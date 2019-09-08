package basic;

import java.util.Scanner;

public class AppleAndOrangle {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	long s=sc.nextLong();
	long t=sc.nextLong();
	long a=sc.nextLong();
	long b=sc.nextLong();
	long m=sc.nextLong();
	long n=sc.nextLong();
	long applescount=0;
	long orangecount=0;
	for(int i=0;i<m;i++)
	{
		long d=sc.nextLong();
		if(s<=(a+d)&&(a+d)<=t)
		{
			applescount++;
		}
	}
	for(int i=0;i<n;i++)
	{
		long d=sc.nextLong();
		if(s<=(b+d)&&(b+d)<=t)
		{
			orangecount++;
		}
	}
	System.out.println(applescount);
	System.out.println(orangecount);

}
}
