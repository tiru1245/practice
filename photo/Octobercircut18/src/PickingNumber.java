import java.util.Arrays;
import java.util.Scanner;

public class PickingNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int max=0;
		Arrays.sort(a);
		for(int i=0;i<n;i++) {
			int tmin=0;
			int tmax=0;
			for(int j=i+1;j<n;j++)
			{
				if(a[i]-a[j]==-1||Math.abs(a[i]-a[j])==0){
					tmin++;
				}
					else  if(a[i]-a[j]==1||Math.abs(a[i]-a[j])==1) {
							tmax++;
				}
				int tep=Math.max(tmax, tmin);
				if(tmax!=0||tmin!=0)tep++;
				max=Math.max(tep, max);
				
			
		}
		}
		if(max==0)
		System.out.println(1);
		else if(max==1)
			System.out.println(2);
		else
			System.out.println(max);
	}
}
	


