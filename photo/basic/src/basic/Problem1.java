package basic;

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			long n=sc.nextLong();
			while(true)
			{
				long sum=0;
				while(n>0)
				{
					sum+=n%10;
					n/=10;
				}
				String as=Long.toString(sum);
				if(as.length()==1)
				{
					System.out.println(as);
					break;
				}
				else
				{
					n=sum;
				}
				
			}
		 	
			
		}
		
		
	}

}
