package basic;

import java.util.Scanner;

public class HelpAshiwn {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int m=sc.nextInt();
			int a[][]=new int[n][m];
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
					a[i][j]=sc.nextInt();
				}
			}
		   
			int max=0;
			int index=0;
			int ans=0;
			for(int i=1;i==1;i++)
			{
				
				for(int j=0;j<m;j++)
				{
					if(a[i][j] > max)
					{
						max=a[i][j];
						index=j;

					}
				}
			}
			ans+=max;
			int indexforfirst=index;
			for(int i=0;i==0;i++)
			{

				int max1=0;
				int max2=0;
				
				for(int j=indexforfirst;j==indexforfirst;j++)
				{
					
						for(int k=j+1;k<m;k++)
						{
							if(a[i][k]> max1)
							{
								max1=a[i][k];
							}
							

						

						}
						for(int l=j-1;l>=0;l--)
						{
							if(a[i][l]> max2)
							{
								max2=a[i][l];
							}
							

						}
					
				}
				if(max1>max2)
				{
					ans+=max1;

				}
				else if(max1<max2)
				{
					ans+=max2;


				}
				else
				{
					ans+=max1;

				}
			}
			for(int i=2;i<n;i++)
			{

				int max1=0;
				int max2=0;
				int index1=0;
				int index2=0;
				for(int j=index;j==index;j++)
				{
					
						for(int k=j+1;k<m;k++)
						{
							if(a[i][k]> max1)
							{
								max1=a[i][k];
								index1=k;
							}
							

						

						}
						for(int l=j-1;l>=0;l--)
						{
							if(a[i][l]> max2)
							{
								max2=a[i][l];
								index1=l;
							}
							

						}
					
				}
				if(max1>max2)
				{
					ans+=max1;
					index=index1;

				}
				else if(max1<max2)
				{
					ans+=max2;
					index=index2;


				}
				else
				{
					ans+=max1;
					index=index1;

				}
			}
			System.out.println(ans);
		
		}
	}

}
