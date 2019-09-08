import java.util.Scanner;

public class LostNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	long or=sc.nextLong();
	long and=sc.nextLong();
	long xor=sc.nextLong();
	if(xor==or-and) {
		long A=or-1;
		long B=xor+1;
		long n=A|B;
		if(n==or) {
			System.out.println();
		}
		else {
			
		}
	}
	else {
		System.out.println(-1);
	}
} 
}
