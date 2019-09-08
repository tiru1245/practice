import java.util.Arrays;
import java.util.Scanner;

public class FindNext {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int q=sc.nextInt();
		int a[]=new int[n];
		int gap[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		gap[0]=0;
		for(int i=1;i<n;i++)
		{
			gap[i]=a[i]-a[i-1];
		}
		while(q-->0)
		{
			int index=0;
			int num=sc.nextInt();
			
			for(int i=0;i<n;i++)
			{
				if(a[i]>=num)
				{
				}
			}
			
		}
		
	}
	

}
