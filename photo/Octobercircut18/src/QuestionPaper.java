import java.util.Scanner;

public class QuestionPaper {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		long od[]=new long[50001];
		od[2]=1;
		od[3]=3;
		for(int i=4;i<=50000;i++)
			od[i]=od[i-1]+2;
		while(t-->0)
		{
		 long n=sc.nextInt();
		 long a=sc.nextInt();
		 long b=sc.nextInt();
		 if(a==b)
		 System.out.println(n*2+1);
		 else
		 {
			 long s=od[(int) n]/2-1;
			 if(s==1)
			 System.out.println(od[(int) n]+n*2+1+s);
			 else
			 {
				 s=(s*(s+1))/2;
				 System.out.println(od[(int) n]+n*2+1+s); 
			 }
				

		 }
		 
		}
	}

}
