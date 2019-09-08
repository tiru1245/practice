package basic;

import java.util.Scanner;

public class DirstibuteCandie {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	long n=sc.nextLong();
	if(n==1||n==2)
	{
		System.out.println(1);
	}
	else
	{
		n=n-1;
		long count=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
}
