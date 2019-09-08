import java.util.Scanner;

public class DrawingBook {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int k=sc.nextInt();
	
	if(n%2==0) {
		if(n==k||1==k) {
			System.out.println(0);
		}
		else {
			int start=1;
			int end=1;
			for(int i=2;i<n-1;i=i+2)
			{
				if(i==k||i+1==k)
				{
					break;
				}
				else {
					start++;
				}
			}
			for(int i=n-1;i>1;i=i-2)
			{
				if(i==k||i-1==k)
				{
					break;
				}
				else {
					end++;
				}
			}
			System.out.println(Math.min(start, end));

		}
	}
	else {
		if(n==k||1==k) {
			System.out.println(0);
		}
		else {
		int start=1;
		int end=0;
		for(int i=2;i<n;i=i+2)
		{
			if(i==k||i+1==k)
			{
				break;
			}
			else {
				start++;
			}
		}
		for(int i=n;i>1;i=i-2)
		{
			if(i==k||i-1==k)
			{
				break;
			}
			else {
				end++;
			}
		}
		System.out.println(Math.min(start, end));
		}
	
	}
	
}
}
