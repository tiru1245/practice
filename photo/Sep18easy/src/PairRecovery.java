import java.util.Scanner;

public class PairRecovery {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a3=sc.nextInt();
		int a4=sc.nextInt();
		int a2=a4-a3;
		int a1=a3-a2;
		System.out.println(a1+" "+a2);
		
	}

}
