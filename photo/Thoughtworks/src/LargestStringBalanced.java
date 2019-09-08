import java.util.Scanner;

public class LargestStringBalanced {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int openpar=0;
			int closepar=0;
			int openbrac=0;
			int closebrac=0;
			int opencurlybra=0;
			int closecurlybra=0;
			int total=0;
			String s=sc.next();
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)=='(')
				{
					openpar++;
				}
				else if(s.charAt(i)==')')
				{
					closepar++;
				}
				else if(s.charAt(i)=='[')
				{
					openbrac++;
				}
				else if(s.charAt(i)==']')
				{
					closebrac++;
				}
				
				else if(s.charAt(i)=='{')
				{
					opencurlybra++;
				}
				else if(s.charAt(i)=='}')
				{
					closecurlybra++;
				}
				
			}
			
			if(openpar>closepar)
			{
				total+=closepar+closepar;

			}
			else if(openpar<closepar)
			{
				total+=openpar+openpar;

			}
			else
			{
				total+=openpar+closepar;
			}
			
			if(openbrac>closebrac)
			{
				total+=closebrac+closebrac;

			}
			else if(openbrac<closebrac)
			{
				total+=openbrac+openbrac;

			}
			else
			{
				total+=openbrac+closebrac;

			}
			if(opencurlybra>closecurlybra)
			{
				total+=closecurlybra+closecurlybra;

			}
			else if(opencurlybra<closecurlybra)
			{
				total+=opencurlybra+opencurlybra;

			}
			else
			{
				total+=opencurlybra+closecurlybra;

			}
			System.out.println(total);
		}
		
	}

}
