import java.util.Scanner;

public class HalloweenSale {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		int d=sc.nextInt();
		int m=sc.nextInt();
		int s=sc.nextInt();
		int count=0;
		int amount=0;
		int cost=s;
		while(true) {
			
				if(p<=m) {
					amount+=m;
				}
				else {
					amount+=p;
					
					p=p-d;
				}
				
				if(amount>cost) {
					break;
				}
				count++;
			
		}
		System.out.println(count);
	}

}
