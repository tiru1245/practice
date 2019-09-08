import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StockExchange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		for(int j=0;j<n;j++)
		{
			b[j]=sc.nextInt();
		}
		ArrayList list=new ArrayList();
		for(int i=0;i<n;i++)
		{
			list.add(new Pair(a[i],b[i]));
		}
		Collections.sort(list, new Comparator<Pair>() {

			

			@Override
			public int compare(Pair o1, Pair o2) {
				// TODO Auto-generated method stub
				return o1.getKey()-o2.getKey();
			}
		});
		int k=sc.nextInt();
		while(k-->0)
		{
			int key=sc.nextInt();
			int key1=Collections.binarySearch(list, key);
			System.out.println(list.get(key1-1));

		}
	}

}
class Pair
{
	int key;
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	int value;
	public Pair(int key,int value)
	{
		this.key=key;
		this.value=value;
	}
}
