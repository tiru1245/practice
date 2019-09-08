import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class MakeThemDifferent {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		HashMap map=new HashMap();
		long ans=0;
		for(int i=0;i<n;i++)
		{if (map.containsKey(a[i])) {
            int h = a[i];
            int count = 0;
            while (map.containsKey(h)) {
                h--;
                count++;
                if (count * y > x) {
                    break;
                }
            }
            if ((count * y) > x) {
                ans += x;
            } else {
                ans += count * y;
                map.put(h, 1);
            }

        } else {
            map.put(a[i], 1);
        }}
		System.out.println(ans);
	}

}
