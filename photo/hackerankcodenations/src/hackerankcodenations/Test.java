package hackerankcodenations;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		if (y == 1918) {

			int feb = 15;
			int thirtyfirst = 31 * 5;
			int thirty = 30 * 2;
			int total = feb + thirty + thirtyfirst;
			int remain = 256 - total;
			System.out.println(remain + ".09." + y);

		} else if(y>1918) {
			int feb = 28;
			if (y % 4 == 0) {
				if (y % 100 != 0) {
					feb = 29;
				} else {
					if (y % 400 == 0)
						feb = 29;
				}

			}

			int thirtyfirst = 31 * 5;
			int thirty = 30 * 2;
			int total = feb + thirty + thirtyfirst;
			int remain = 256 - total;
			System.out.println(remain + ".09." + y);
		}
		else
		{

			int feb = 28;
			if (y % 4 == 0) {
				 feb = 29;
				

			}

			int thirtyfirst = 31 * 5;
			int thirty = 30 * 2;
			int total = feb + thirty + thirtyfirst;
			int remain = 256 - total;
			System.out.println(remain + ".09." + y);
		
		}
	}

}