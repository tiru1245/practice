package julyeasy2019;

import java.util.Scanner;

public class Coprime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n-2;i>=1;i--) {
			int gc=gcd(n,i);
			if(gc==1) {
				System.out.println(i);
				break;
			}
		}
	}

	private static int gcd(int a, int b) {
		if(b==0) {
			return a;
		}
		return gcd(b,a%b);
	}

}
