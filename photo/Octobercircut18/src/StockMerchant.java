import java.util.HashMap;
import java.util.Scanner;

public class StockMerchant {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
			for(int i=0;i<n;i++) {
				int num=sc.nextInt();
				if(map.containsKey(num)) {
				int n1=map.get(num);
				map.put(num, ++n1);
				}
				else {
					map.put(num, 1);
				}
			}
			int count=0;
			for (Integer key : map.keySet()) {
			   int pair=map.get(key);
			   count+=pair/2;
			}
			System.out.println(count);
		
	}

}
