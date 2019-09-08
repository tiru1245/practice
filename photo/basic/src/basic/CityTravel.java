package basic;

import java.util.Scanner;

public class CityTravel {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	long s=sc.nextInt();
	long x=sc.nextInt();
	long t=sc.nextInt();
	long sum=0;
	for(int i=0;i<t;i++)
	{
		long day=sc.nextLong();
		long y=sc.nextLong();
		if(s/x<=day)
		sum+=y;
	}
	long r=s-sum;
	long days=0;
	if(r>0)
	{
		if(r%x==0)
		{
			days=r/x;
		}
		else
		{
			days=r/x+1;
		}
		System.out.println(days+t);
	}
	else
		
	{
		
		System.out.println(s/x);
	}

}
}
