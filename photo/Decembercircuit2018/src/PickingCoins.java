import java.math.BigInteger;
import java.util.Scanner;

public class PickingCoins {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			BigInteger n=new BigInteger(sc.next());
			BigInteger k=new BigInteger(sc.next());
			int res=n.compareTo(k);
             int res1=k.compareTo(new BigInteger("1"));
			if(res1==0 && res==1) {
				
				System.out.println("Bob");
			}
			else if(res==-1) {
				System.out.println("Bob");
			}
			else if(res1==0 && res==0) {
				System.out.println("Alice");
			}
			else {
				int i=1;
				boolean flag=true;
				while(true) {
					BigInteger power=k.pow(i);
					int ts=n.compareTo(power);
					if(ts==-1) {
						flag=false;
						break;
					}
					else {
						n=n.subtract(power);
						flag=true;
					}
					if(flag) {
						int ts1=n.compareTo(power);
						if(ts1==-1) {
							flag=true;
							break;
						}
						
						
						else {
							n=n.subtract(power);
							flag=false;
						}
					}
             i++;			
             }
				if(flag) {
					System.out.println("Alice");
				}
				else {
					System.out.println("Bob");
				}	
			}
			
					}
	}

	

}
