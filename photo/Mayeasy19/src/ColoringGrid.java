import java.util.Scanner;

public class ColoringGrid {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			long n=sc.nextLong();
			long k=sc.nextLong();
			if(n==1){
				System.out.println(0);
			}
			else if(n<=k){
				System.out.println(n);
			}
			else if(n>=k){
				System.out.println(k);
			}
		}

	}

