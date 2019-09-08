package hackerankuniversityspring;

import java.util.Scanner;

public class ExceedingSpeed {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<=90)
		{
			System.out.println(0+" No punishment");
		}
		else if(n>90&&n<=110)
		{
			System.out.println((n-90)*300+" Warning");

		}
		else
		{
			System.out.println((n-90)*500+" License removed");

		}
	}

}
