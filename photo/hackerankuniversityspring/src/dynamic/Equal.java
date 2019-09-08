package dynamic;

import java.util.Arrays;
import java.util.Scanner;

public class Equal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			System.out.println(equal(a));
		}
		
	}
	static int equal(int[] a) {
	    int min = Arrays.stream(a).min().getAsInt();
	    int ans = Integer.MAX_VALUE;
	    for (int i = 0; i < 5; ++i) {
	        int ops = 0;
	        for (int j = 0; j < a.length; ++j) {
	            int t = a[j] - (min - i);
	            ops  += t/5 + t%5/2 + t%5%2;
	        }
	        ans = Math.min(ans, ops);
	   }
	   return ans;
	}
}
