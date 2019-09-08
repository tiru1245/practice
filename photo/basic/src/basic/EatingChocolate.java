package basic;

import java.util.Scanner;

public class EatingChocolate
 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0)
	{
		long num=sc.nextLong();
		if(num==1)
		{
			System.out.println("A");
		}
		else if(num==2)
		{
			System.out.println("A");
		}
		else if(num==3)
		{
			System.out.println("B");
		}
		else
		{
			
				if(num==1)
				{
					System.out.println("A");
					break;
				}
				else if(num==2)
				{
					System.out.println("A");
					break;
				}
				else if(num==3)
				{
					System.out.println("B");
					break;
				}
				long totalsum=((num)*(num+1))/2;
				long square=(long) Math.sqrt(totalsum) ;
				long sqt=square*square;
				long bal=totalsum-sqt;
				if(bal%num==0)
				{
					System.out.println("A");
				}
				else
				{
					System.out.println("B");
				}
			
			
			
		}
		 
		
		
	}
}
}
