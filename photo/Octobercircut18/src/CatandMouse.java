import java.util.Scanner;

public class CatandMouse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();
		while(q-->0) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int bd=0;
			int ad=0;
			if(a==b) {
				System.out.println("Mouse C");
			}
			else if(a<b){
				if(b>c) {
					 bd=b-c;
				}
				else {
					 bd=c-b;
				}
				if(c>a) {
					ad=c-a;
				}else {
					 ad=a-c;

				}
				if(bd==ad) {
					System.out.println("Mouse C");
				}
				else if(bd<ad) {
					System.out.println("Cat B");

				}
				else {
					System.out.println("Cat A");

				}
			}
			else
			{

			  if(a>c) {
					 ad=a-c;
				}
				else {
					 ad=c-a;
				}
			  if(c>b) {
					bd=c-b;
				}else {
					 bd=b-c;

				}
			  if(bd==ad) {
					System.out.println("Mouse C");
				}
				else if(bd<ad) {
					System.out.println("Cat B");

				}
				else {
					System.out.println("Cat A");

				}
			}
			
		}
	}

}
