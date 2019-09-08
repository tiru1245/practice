package aug18;

import java.util.Scanner;

public class PicuBank {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			long d=sc.nextLong();
			long a=sc.nextLong();
			long m=sc.nextLong();
			long b=sc.nextLong();
			long x=sc.nextLong();
			if(m==1)
			{
				long l=x/a;
				long y=l/2;
				long total=d+(y*a)+(y*b);
				long day=y*2;
				long z=x-total;
				if(z==(a+b))
				System.out.println(day+2);
				else if(z<(a+b))
				{
					
				}
					System.out.println();
				
			}
			else
			{
				double c=(m*x)-(d*m);
				double f=((m-1)*a)+b;
			    double y= c/f;
			    if(y<0)
			    {
			        System.out.println("0");
			    }
			    else
			    {
			        double fraction=(y-(long)y);
				    if(fraction>=0.5)
				    {
					    System.out.println((long)Math.ceil(y));

				    }
				    else
				    {
					    System.out.println((long)Math.floor(y));

				    }
			    }
			}
			
		
		  
		   
			 
			
	
			
			
		}
		 
	}

}
