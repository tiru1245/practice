import java.text.DecimalFormat;
import java.util.Scanner;

public class GoldenRectangle {
	private static DecimalFormat df2 = new DecimalFormat(".#");

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;

		for(int i=0;i<n;i++) {
			double w=sc.nextLong();
			double h=sc.nextLong();
			
			double d=Double.parseDouble(df2.format(w/h));
		
			if(d<=1.7&&d>=1.6) {
				count++;
			}
			
		}
		System.out.println(count);
		
	}
}
